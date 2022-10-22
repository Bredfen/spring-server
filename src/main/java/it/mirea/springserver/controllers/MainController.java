package it.mirea.springserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.mirea.model.User;
import it.mirea.repo.*;


@Controller
public class MainController {

	 @Autowired
	 private UserRepository userRepository;

	
	@GetMapping("/")
	public String greeting( Model model) {
		Iterable<User> users = userRepository.findAll();
		
		model.addAttribute("title", "Поебда");
		model.addAttribute("users", users);
		return "resp";
	}

}
