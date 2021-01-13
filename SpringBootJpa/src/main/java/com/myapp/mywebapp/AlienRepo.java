package com.myapp.mywebapp;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

	Alien findByName(String name);
	
	List<Alien> findByAidGreaterThan(int aid);
	
	@Query("from Alien order by name")
	List<Alien> findByNameSorted();
}
