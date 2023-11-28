package com.spring.urlshortener.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.urlshortener.dao.UrlDao;
import com.spring.urlshortener.entities.Url;

@Service
public class UrlServiceImpl implements UrlService {
	
	@Autowired
	public UrlDao urlDao;
	
	@Override
	public Url addUrl(String url) {
		Url ur = null;
		for(Url u: this.urlDao.findAll()) {
			if(u.getUrl().equals(url)) {
				ur = u;
				break;
			}
		}
		return ur == null ? this.urlDao.save(new Url(url)) : ur;
	}

	@Override
	public Url getShortUrl(long id) {
		Url url = null;
		
	
		for(Url u: this.urlDao.findAll()) {
			if(u.getId() == id) {
				url = u;
				break;
			}
		}
		
		return url;
	}

	@Override
	public List<Url> getUrls() {
		// TODO Auto-generated method stub
		return this.urlDao.findAll();
	}

}
