package org.jsoup.y.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class A {

    public static void main(String[] args) {
        while (true) {
            sleep(1000);
            getAddr();
        }
    }

    private static void getAddr() {
        try {
            Document doc = Jsoup.connect("http://1212.ip138.com/ic.asp")
                    .userAgent(
                            "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/49.0.2623.75 Safari/537.36")
                    .timeout(3 * 1000).ignoreContentType(true).ignoreHttpErrors(true).get();
            System.out.println(doc.text());
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    private static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}