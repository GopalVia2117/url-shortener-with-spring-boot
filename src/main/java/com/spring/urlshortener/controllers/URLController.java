package com.spring.urlshortener.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.urlshortener.entities.Url;
import com.spring.urlshortener.services.UrlService;

@RestController
public class URLController {
	@Autowired
	public UrlService urlService;
	
	
	@GetMapping("/home")
	public String getUrl() {
		return "Welcome";
	}
	
	@PostMapping("/")
	public Url addUrl(@RequestBody String url) {
		return this.urlService.addUrl(url);
	}
	
	@GetMapping("/{id}")
	public Url getShortUrl(@PathVariable long id) {
		return this.urlService.getShortUrl(id);
	}
	
	@GetMapping("/")
	public List<Url> getUrls(){
		return this.urlService.getUrls();
	}
}
