package com.zlp.springboot.controller;

import com.zlp.springboot.properties.DataProperties;
import com.zlp.springboot.service.UserService;
import com.zlp.springboot.utils.Params;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("home")
public class HomeController {
	
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	UserService userService;
	
	@Autowired
	DataProperties dataProperties;

	@GetMapping("")
	public String index(Model model, Params params) {
		userService.list(params.getParams());
		model.addAttribute("name", "zengleping");
		return "index";
	}
}
