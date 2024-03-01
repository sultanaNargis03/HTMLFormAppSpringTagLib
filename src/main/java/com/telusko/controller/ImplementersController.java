package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.model.Implementers;

@Controller
public class ImplementersController 
{
	@GetMapping("/register")
	public String responseHome(@ModelAttribute("impl")Implementers impl)
	{
		return "register";
	}
	@PostMapping("/register")
	public String registerData(Map<String,Object> model,@ModelAttribute("impl")Implementers impl)
	{
		model.put("impl", impl);
		return "result";
	}
}
