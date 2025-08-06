package com.wisestep.urlshortener.service;

import com.wisestep.urlshortener.model.UrlMapping;

public interface UrlShortenerService {
    UrlMapping shortenUrl(String originalUrl);
    String getOriginalUrl(String shortUrl);
}
