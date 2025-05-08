package com.edu.home.apple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.home.apple.dto.AppleDto;
import com.edu.home.apple.service.AppleService;

@RequestMapping("/fruit")
@Controller
public class AppleController1 {
   
	@Autowired
	private AppleService appleService;
	
	// 리스트 화면으로
	@GetMapping("/apple1")
	public String getMemberList(Model model) {
		
		model.addAttribute("fruTitle", "과일명");
		model.addAttribute("fruPrice", 12000);
	    
		return "ApplePear1";
	}
	
	@GetMapping("/apple2")
	public String getAppleOne(Model model) {

		AppleDto appleDto = appleService.appleSelectOne(1);
		
		model.addAttribute("fruTitle", "과일명");
		model.addAttribute("fruPrice", 12000);
		
		model.addAttribute("appleDto", appleDto);

	    
		return "ApplePear2";
	}

}
