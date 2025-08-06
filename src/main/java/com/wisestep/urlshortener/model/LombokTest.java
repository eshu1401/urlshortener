package com.wisestep.urlshortener.model;

public class LombokTest {
    public static void main(String[] args) {
        UrlMapping mapping = new UrlMapping();
        mapping.setOriginalUrl("http://google.com");
        mapping.setShortUrl("abcd1234");

        System.out.println(mapping);
    }
}
