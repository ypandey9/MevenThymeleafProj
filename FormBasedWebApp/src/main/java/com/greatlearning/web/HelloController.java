package com.greatlearning.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String giveWelcomeMessage(ModelMap model) {
		model.addAttribute("message", "Spring MVC Thymeleaf Hello word");
		return "welcome";
	}
}
