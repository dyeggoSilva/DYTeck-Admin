package com.dytech.m3d2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class homeController {
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("nome","Dyeggo");
		model.addAttribute("sobrenome","Bezerra");
		return "home/index";
	}

}
	