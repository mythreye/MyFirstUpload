package com.casamobel.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.casamobel.model.*;


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
	
	@RequestMapping(value="Login",method=RequestMethod.GET)
	public ModelAndView showlogin(@ModelAttribute("Login")Login Login) 
	{
		System.out.println("hmmmmmmmmmmm");
		ModelAndView  model= new ModelAndView("Login");
		return model;
	}
	
	@RequestMapping(value="NewUser",method=RequestMethod.GET)
	public ModelAndView showlogin(@ModelAttribute("NewUser")NewUser NewUser) 
	{
	System.out.println("NewUser");
	ModelAndView  model= new ModelAndView("NewUser");
	return model;
	}
	
}
