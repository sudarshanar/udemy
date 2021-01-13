package com.myapp.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyRestController {
	@Autowired
	AlienRepo repo;

	@GetMapping("home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

	@GetMapping("addAlien")
	public ModelAndView addAlien(Alien alien) {
		int user = alien.getAid();
		String pwd = alien.getName();
		System.out.println(user + ":" + pwd);
		repo.save(alien);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

	@GetMapping("aliens")
	public List<Alien> getAliens() {
		return repo.findAll();
	}

	@GetMapping("/aliens/{aid}")
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}

	@PostMapping(path = "addAlien", consumes = "application/json")
	public Alien addPostAlien(@RequestBody Alien alien) {

		repo.save(alien);
		return alien;
	}

	@DeleteMapping("deleteAlien/{aid}")
	public String deleteAlien(@PathVariable("aid") int aid) {
		Alien alien = repo.getOne(aid);
		repo.delete(alien);
		return "deleted";
	}
	
	@PutMapping(path = "updateAlien")
	public Alien updateAlien(@RequestBody Alien alien) {

		repo.save(alien);
		return alien;
	}
}
