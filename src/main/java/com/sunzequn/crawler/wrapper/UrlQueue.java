package com.sunzequn.crawler.wrapper;

import com.sunzequn.crawler.utils.PropertiesUtil;

import java.util.Set;

/**
 * Created by Sloriac on 15/11/21.
 * <p>
 * The wrapper class for the queue of urls,
 * which contains two parts: unvisited urls and visited urls.
 */
public class UrlQueue {

    /**
     * The Singleton instance of this class.
     */
    private static final UrlQueue instance = new UrlQueue();

    /**
     * The queue for unvisited urls.
     */
    private LimitedQueue<String> unvisitedUrls;

    /**
     * The collection for visited urls.
     * It has a good search performance to use <code>Set</code>.
     */
    private Set<String> visitedUrls;

    /**
     * The maximum number of unvisited urls.
     * It is initialized from the config file if defined.
     */
    private int maxVisitedUrlNumber = 10000;
    private int maxUnvisitedUrlNumber = 100;

    /**
     * Default constructor for <code>UrlQueue</code> with variable initializations.
     */
    private UrlQueue() {
        String number;
        number = PropertiesUtil.getValue("maxVisitedUrlNumber");
        if (number != null){
            maxVisitedUrlNumber = Integer.parseInt(number);
        }
        number = PropertiesUtil.getValue("maxUnvisitedUrlNumber");
        if (number != null){
            maxUnvisitedUrlNumber = Integer.parseInt(number);
        }
        unvisitedUrls = new LimitedQueue<>(maxUnvisitedUrlNumber);
        visitedUrls = new LimitedSet<>(maxVisitedUrlNumber);
    }

    /**
     * Returns the Singleton instance of this class.
     *
     * @return singleton instance
     */
    public static UrlQueue instance() {
        return instance;
    }
}
