package com.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.form.dao.UserRepository;
import com.form.entities.User;

@Controller
public class HomeController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("title", "Home");
		return "home";
	}
	
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		model.addAttribute("title", "Register");
		model.addAttribute("user", new User());
		return "signup";
	}
	
	
	//handler for submitting form
	@RequestMapping(value="/do_register",method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user,Model model) {
		User result=this.userRepository.save(user);
		model.addAttribute("user", result);
		return "signup";
	}
}
