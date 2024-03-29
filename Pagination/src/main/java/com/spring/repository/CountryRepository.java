package com.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Country;

@Repository("repo")
public interface CountryRepository extends JpaRepository<Country,Integer> {
	

}
