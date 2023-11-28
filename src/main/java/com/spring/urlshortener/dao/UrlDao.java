package com.spring.urlshortener.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.urlshortener.entities.Url;

public interface UrlDao extends JpaRepository<Url, Long> {
	
}
