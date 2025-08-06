package com.wisestep.urlshortener.service;

import com.wisestep.urlshortener.model.UrlMapping;
import com.wisestep.urlshortener.repository.UrlMappingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UrlShortenerServiceImpl implements UrlShortenerService {

    @Autowired
    private UrlMappingRepository repository;

    @Override
    public UrlMapping shortenUrl(String originalUrl) {
        String shortCode = generateShortCode(originalUrl);

        UrlMapping mapping = new UrlMapping();
        mapping.setOriginalUrl(originalUrl);
        mapping.setShortUrl(shortCode);
        mapping.setCreatedAt(LocalDateTime.now());

        return repository.save(mapping);
    }

    @Override
    public String getOriginalUrl(String shortCode) {
        Optional<UrlMapping> optionalMapping = repository.findByShortUrl(shortCode);
        return optionalMapping.map(UrlMapping::getOriginalUrl).orElse(null);
    }

    // You can replace this with a better logic like UUID or hash
    private String generateShortCode(String originalUrl) {
        return Integer.toHexString(originalUrl.hashCode());
    }
}
