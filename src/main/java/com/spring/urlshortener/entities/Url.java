package com.spring.urlshortener.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Url {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String url;
	
	public Url() {
		super();
	}
	
	public Url(String url) {
		super();
		this.url = url;
	}
	
	public long getId() {
		return id;
	}

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}
