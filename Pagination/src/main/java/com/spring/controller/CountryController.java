package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Country;
import com.spring.repository.CountryRepository;


@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	CountryRepository repository;
	
	@GetMapping("/get/{page}")
	public Page<Country> getAllCountries(@PathVariable("page")int page){
		
		return  repository.findAll(PageRequest.of(page,4));
		
	}

}
