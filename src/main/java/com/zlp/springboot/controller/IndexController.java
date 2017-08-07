package com.zlp.springboot.controller;

import com.zlp.springboot.service.UserService;
import com.zlp.springboot.vo.LoginProfile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("index")
public class IndexController {
	
	Logger logger = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	UserService userService;

	@GetMapping("")
	public String index(Model model, LoginProfile prof) {
		model.addAttribute("prof", prof);
		return "index";
	}
}
