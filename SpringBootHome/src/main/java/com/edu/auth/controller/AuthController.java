package com.edu.auth.controller;
import com.edu.freeBoard.controller.FreeBoardController;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.auth.domain.PrincipalDetails;

@RequestMapping("/auth")
@Controller
public class AuthController {

	// 로그인 페이지 처리
	@GetMapping("/login")
	public String loginPage(Authentication authentication) {
		
		if(authentication != null && authentication.isAuthenticated()) {
			return "redirect:/member/list";
		}
		
		return "auth/loginFormView";
	}
	
	@GetMapping("/profile")
	public String profile(Model model) {
		Authentication auth = 
			SecurityContextHolder.getContext().getAuthentication();
		
		if(auth.getPrincipal() instanceof PrincipalDetails) {
			PrincipalDetails user = (PrincipalDetails)auth.getPrincipal();
			
			model.addAttribute("userPhoto", user.getAttribute("picture"));
			model.addAttribute("userName", user.getUsername());
			model.addAttribute("userEmail", user.getAttribute("email"));
			
			System.out.println("????: " + user.getName());
		}
		return "auth/user-profile";
	}
	
	@GetMapping("/logoutView")
	public String logoutView() {
		return "auth/logoutView";
	}
	
	@GetMapping("/loginFailView")
	public String loginFailView() {
		return "auth/loginFailView";
	}
}
