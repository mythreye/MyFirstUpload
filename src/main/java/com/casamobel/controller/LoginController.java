package com.casamobel.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController 
{
	@RequestMapping("/about")
	public String showAboutUs() 
	{
	System.out.println("about us");
	return "about";
	}
	@RequestMapping("/contactus")
	public String showContactUs() 
	{
	System.out.println("ContactUs");
	return "contactus";
	}
	@RequestMapping("/login")
	public String showlogin() 
	{
	System.out.println("login");
	return "login";
	}

}
