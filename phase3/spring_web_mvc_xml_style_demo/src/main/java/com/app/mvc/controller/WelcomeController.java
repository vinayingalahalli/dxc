package com.app.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String sayHello() {
		return "welcome";
	}
	
	@RequestMapping(value = "/hi",method =RequestMethod.GET )
	public String sayHelloByNameGet(@RequestParam String fname,ModelMap map) {
		map.addAttribute("fname", fname);
		return "hello";
	}
	
	@RequestMapping(value = "/hi",method =RequestMethod.POST )
	public String sayHelloByNamePost(@RequestParam String fname,ModelMap map) {
		map.addAttribute("fname", fname);
		return "hello";
	}
}
