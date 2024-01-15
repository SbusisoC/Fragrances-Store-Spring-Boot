package com.sbu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sbu.demo.dao.FragrancesRepo;
import com.sbu.demo.model.Fragrances;

@Controller
public class FragrancesController {
	
	@Autowired
	FragrancesRepo repo;
	
	@GetMapping("/")
	public String home() {
		
		return "home.jsp";
	}
	
	@GetMapping("/addFragrances")
	public String addFragrances(Fragrances fragrances)
	{
		repo.save(fragrances);
		return "home.jsp";
	}
	
	@GetMapping("/getFragrances")
	public ModelAndView getFragrances(@RequestParam int id)
	{
		ModelAndView mv= new ModelAndView("showFragrances.jsp");
		Fragrances fragrances = repo.findById(id).orElse(new Fragrances());
		mv.addObject(fragrances);
		return mv;
	}
}
