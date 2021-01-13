package com.myapp.rest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

	Alien findByName(String name);
	
	List<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien order by name")
	List<Alien> findByNameSorted();
}
