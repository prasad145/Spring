package com.spring.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController 
{
	@RequestMapping("/showForm")
	public String showForm(Model mModel)
	{
		mModel.addAttribute("student", new Student());
		return "student-form";
	}	
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student sStudent)
	{	
		return "confirmation-page";
	}
}
