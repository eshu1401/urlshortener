package com.wisestep.urlshortener.controller;

import com.wisestep.urlshortener.model.UrlMapping;
import com.wisestep.urlshortener.service.UrlShortenerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UrlShortenerController {

    private final UrlShortenerService service;

    // ✅ Constructor-based dependency injection
    @Autowired
    public UrlShortenerController(UrlShortenerService service) {
        this.service = service;
    }

    @PostMapping("/shorten")
    public UrlMapping shortenUrl(@RequestBody UrlMapping request) {
        return service.shortenUrl(request.getOriginalUrl());
    }

    @GetMapping("/{shortCode}")
    public String redirectToOriginal(@PathVariable String shortCode) {
        return service.getOriginalUrl(shortCode);
    }
}
