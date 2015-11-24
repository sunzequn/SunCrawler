package com.sunzequn.crawler.test.parse;

import com.sunzequn.crawler.parser.HttpMethod;
import com.sunzequn.crawler.parser.PullText;
import org.junit.Test;

/**
 * Created by Sloriac on 15/11/24.
 */
public class PullTextTest extends PullText {

    @Test
    public void test() {

//        String url = "http://sunzequn.com/";
//        System.out.println(this.pullFromUrl(url, 3000, HttpMethod.Get));
//
//        String url1 = "http://sunzequn.com/";
//        System.out.println(this.pullFromUrl(url1, 3000, HttpMethod.Post));

        String url = "http://list.jd.com/list.html?cat=1713,3287,3797";
        System.out.println(this.pullFromUrl(url, 5000, HttpMethod.Get));
    }
}
