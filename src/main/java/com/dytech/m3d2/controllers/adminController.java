package com.dytech.m3d2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.dytech.m3d2.entidades.Admin;
import com.dytech.m3d2.repository.AdministradoresRepo;


@Controller
public class adminController {
	@Autowired
	private AdministradoresRepo repo;
	
	@GetMapping("/admins")
	public String index(Model model) {
		
		List<Admin>administradores=(List<Admin>)repo.findAll();
		model.addAttribute("administradores",administradores);
		
		return "admins/index";
	}

}
	