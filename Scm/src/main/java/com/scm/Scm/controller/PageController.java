package com.scm.Scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {
	
@RequestMapping("/home")
	public String home(Model model) 
	{
		System.out.println("Home page Controller");
		//sending data to view
		model.addAttribute("name","Substring Technology");
		model.addAttribute("GithubRepository","https://github.com/Sagarnegi12/ShopInn");
		return "home";
	}
@RequestMapping("/About")

public String AboutPage(Model model)
{

	System.out.println("About page loading");
return "About";
	
}
@RequestMapping("/Service")
public String ServicePage()
{
	System.out.println("Service page page loading ");
	return "Service";
}
}
