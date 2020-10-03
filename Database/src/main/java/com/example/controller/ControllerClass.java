
package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.repository.StudentRepository;



@Controller
public class ControllerClass {
	
	
	@Autowired
	StudentRepository studentRepository;
	
	
	
	@RequestMapping("/test")
	public String index() {
		return "Greeting from Spring Boot";
	}
	
	@GetMapping("/index")
	public String greeting(@RequestParam(name= "name",required =false, defaultValue ="World")String name, Model model) {
		model.addAttribute("name", name);
		return "second";	
	}
	
	@GetMapping("/students")
	public String list(Model model) {
		model.addAttribute("students", studentRepository.findAll());
		return "First";
	}

}

