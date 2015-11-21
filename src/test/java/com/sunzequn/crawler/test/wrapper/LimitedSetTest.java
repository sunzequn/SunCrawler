package com.sunzequn.crawler.test.wrapper;

import com.sunzequn.crawler.wrapper.LimitedSet;
import org.junit.Test;

import java.util.Set;

/**
 * Created by Sloriac on 15/11/21.
 */
public class LimitedSetTest {


    @Test
    public void setAddTest(){

        Set<String> set = new LimitedSet<String>(2);
        set.add("1");
        set.add("2");
        set.add("3");
        System.out.println(set.size());
    }
}
