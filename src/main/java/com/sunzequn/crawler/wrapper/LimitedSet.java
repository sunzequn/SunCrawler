package com.sunzequn.crawler.wrapper;

import com.sunzequn.crawler.exception.QueueException;

import java.util.HashSet;

/**
 * Created by Sloriac on 15/11/21.
 */
public class LimitedSet<T> extends HashSet<T> {

    private int maxNumber;

    public LimitedSet() {
        super();
    }

    public LimitedSet(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public boolean add(T t) {
        try {
            if (super.size() < maxNumber) {
                return super.add(t);
            } else {
                throw new QueueException("The size of the set comes to it`s maximum.");
            }
        } catch (QueueException e) {
            e.printStackTrace();
            return false;
        }
    }
}
