package com.sunzequn.crawler.exception;

/**
 * Created by Sloriac on 15/11/21.
 *
 * Handle exceptions about the custom queues,
 * that is <code>Queue</code> and <code>UrlQueue</code>.
 */
public class QueueException extends Exception {

    public QueueException() {
        super();
    }

    public QueueException(String message) {
        super(message);
    }
}
