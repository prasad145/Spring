package com.spring.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class FormController {
	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "simple-form";
	}
	
	// parsing request params using request object of http
	@RequestMapping("/processForm")
	public String displayForm(HttpServletRequest req, Model model)
	{
		String name = req.getParameter("yourName");
		
		model.addAttribute("message", "Yo! " + name.toUpperCase());
		
		return "display-form";
	}
	
	// parsing request params using @RequestParam Annotation
	@RequestMapping("/anotherProcessForm")
	public String displayAnotherForm(@RequestParam("yourName") String name, Model model)
	{
		model.addAttribute("message", "Yo! " + name.toUpperCase());
		
		return "display-form";
	}
}
