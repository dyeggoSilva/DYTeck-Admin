package com.dytech.m3d2.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class adminController {
	
	@GetMapping("/admins")
	public String index() {
		//model.addAttribute("nome","Dyeggo");
		return "admins/index";
	}

}
	