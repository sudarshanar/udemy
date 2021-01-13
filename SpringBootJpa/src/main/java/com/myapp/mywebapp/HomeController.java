package com.myapp.mywebapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@Autowired
	AlienRepo repo;

	@RequestMapping("home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("addAlien")
	public ModelAndView addAlien(Alien alien) {
		int user = alien.getAid();
		String pwd = alien.getName();
		System.out.println(user + ":" + pwd);
		repo.save(alien);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("getAlien")
	public ModelAndView getAlien(@RequestParam("aid") int id) {
		Alien alien = repo.findById(id).orElse(null);
		ModelAndView mv = new ModelAndView();
		mv.addObject("alien", alien);
		mv.setViewName("showAlien");
		return mv;
	}

	@RequestMapping("updateAlien")
	public ModelAndView updateAlien(@RequestParam("aid") int id, @RequestParam("name") String name) {
		Alien alien = new Alien();
		alien.setAid(id);
		alien.setName(name);
		repo.save(alien);
		ModelAndView mv = new ModelAndView();
		mv.addObject("alien", alien);
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("deleteAlien")
	public ModelAndView deleteAlien(@RequestParam("aid") int id) {
		repo.deleteById(id);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("getAlienByName")
	public ModelAndView getAlienByName(@RequestParam("name") String name) {
		Alien alien = repo.findByName(name);
		ModelAndView mv = new ModelAndView();
		mv.addObject("alien", alien);
		mv.setViewName("showAlien");
		return mv;
	}

	@RequestMapping("getAlienGreater")
	public ModelAndView getAlienGreater(@RequestParam("aid") int aid) {
		List<Alien> alien = repo.findByAidGreaterThan(aid);
		ModelAndView mv = new ModelAndView();
		mv.addObject("alien", alien);
		mv.setViewName("showAlien");
		return mv;
	}

	@RequestMapping("getAlienSorted")
	public ModelAndView getAlienSorted() {
		List<Alien> alien = repo.findByNameSorted();
		System.out.println(alien);
		ModelAndView mv = new ModelAndView();
		mv.addObject("alien", alien);
		mv.setViewName("showAlien");
		return mv;
	}
}
