package com.wisestep.urlshortener.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "urls")
public class UrlMapping {

    @Id
    private String id;

    private String originalUrl;
    private String shortUrl;
    private LocalDateTime createdAt;
}
