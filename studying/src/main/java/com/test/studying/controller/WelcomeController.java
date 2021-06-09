package com.test.studying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller public class WelcomeController { 
	@RequestMapping("/welcome") public String welcome() { 
		return "test"; }
	@RequestMapping("/main") public String main() { 
		return "main"; }
	@RequestMapping("/top") public String top() { 
		return "top"; }
	@RequestMapping("/singup") public String singup() { 
		return "singup"; }
	@RequestMapping("/login") public String login() { 
		return "login"; }

}
