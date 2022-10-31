package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controleur {
	
	@GetMapping("/")
	public String Accueil(Model m) {
		m.addAttribute("person", new Person());
		return "index";
	}

	@PostMapping("/message")
	public String Message(@ModelAttribute Person person, Model model) {
		model.addAttribute("person", person);
		return "message";
	}
	
}
