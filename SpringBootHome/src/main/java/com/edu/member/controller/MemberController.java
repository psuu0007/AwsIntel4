package com.edu.member.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.member.domain.MemberVo;
import com.edu.member.service.MemberService;

import jakarta.servlet.http.HttpSession;

@RequestMapping("/member")
@Controller
public class MemberController {

	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	private final String logTitleMsg = "==회원 Control==";
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/login")
	public String login(Model model) {
		logger.info(logTitleMsg);
		logger.info("login");
		
		
		return "member/loginFormView";
	}
	
	@PostMapping("/login")
	public String getLogin(String email, String password,
		HttpSession session, Model model) {
		logger.info(logTitleMsg);
		logger.info("login! " + email + ", " + password);
		
		MemberVo memberVo = memberService.memberExist(email, password);
		
		if(memberVo != null) {
			session.setAttribute("member", memberVo);
			
			return "redirect:/member/list";
		}else {
			return "/member/loginFailView";
		}
		
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession session, Model model) {
		logger.info(logTitleMsg);
		logger.info("logout");
		
		session.invalidate();
		
		return "redirect:/member/login";
	}
	
	// 회원 리스트 화면 제작
	@GetMapping("/list")
	public String getMemberList(Model model) {
		logger.info(logTitleMsg);
		logger.info("getMemberList");
		
		List<MemberVo> memberList = memberService.memberSelectList();

		model.addAttribute("memberList", memberList);
		
		return "member/memberListView";
	}
	
	@GetMapping("/add")
	public String memberAdd(Model model){
		logger.info(logTitleMsg);
		logger.info("memberAdd");
		
		
//		res.sendRedirect("./MemberForm.jsp");
		return "member/memberFormView";
	}
	
	@PostMapping("/add")
	public String memberAdd(MemberVo memberVo, Model model){
		logger.info(logTitleMsg);
		logger.info("@PostMapping memberAdd: {}", memberVo);
		
		memberService.memberInsertOne(memberVo);
		
		return "redirect:/member/list";
	}
	
}
