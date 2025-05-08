package com.edu.home.apple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/fruit")
@Controller
public class AppleController1 {
   
	// 리스트 화면으로
	@GetMapping("/apple1")
	public String getMemberList(Model model) {

		model.addAttribute("fruTitle", "과일명");
		model.addAttribute("fruPrice", 12000);
		

	    
		return "ApplePear1";
	}

}
