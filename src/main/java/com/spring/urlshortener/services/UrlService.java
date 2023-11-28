package com.spring.urlshortener.services;

import java.util.List;

import com.spring.urlshortener.entities.Url;

public interface UrlService {
	public Url addUrl(String url);
	public Url getShortUrl(long id);
	public List<Url> getUrls();
}
