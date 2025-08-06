package com.wisestep.urlshortener.repository;

import com.wisestep.urlshortener.model.UrlMapping;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UrlMappingRepository extends MongoRepository<UrlMapping, String> {
    Optional<UrlMapping> findByShortUrl(String shortUrl);
}
