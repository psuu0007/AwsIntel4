package com.edu.member.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
	
	//바로 지울거임
	@GetMapping("/test")
	public String test(Model model) {
		
		return "member/test";
	}
	
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
	
	@GetMapping("/detail")
	public String memberDetail(@RequestParam int memberNo, Model model) {
		logger.info(logTitleMsg);
		logger.info("@GetMapping memberDetail memberNo: {}", memberNo);
		
		MemberVo memberVo = memberService.memberSelectOne(memberNo);
		
		model.addAttribute("memberVo", memberVo);
		
		return "member/memberDetailView";
	}
	
	@GetMapping("/update")
	public String memberUpdate(int memberNo, Model model) {
		logger.info(logTitleMsg);
		logger.info("@GetMapping memberUpdate memberNo: {}", memberNo);

		MemberVo memberVo = memberService.memberSelectOne(memberNo);

		model.addAttribute("memberVo", memberVo);

		return "member/memberUpdateFormView";
	}

	@PostMapping(value = "/update")
	public String memberUpdate(MemberVo memberVo
		, RedirectAttributes redirectAttributes) {
		logger.info(logTitleMsg);
		logger.info("@PostMapping memberUpdate memberVo: {}", memberVo);

		memberService.memberUpdateOne(memberVo);

		redirectAttributes.addAttribute("memberNo", memberVo.getMemberNo());
		
		return "redirect:/member/detail";
	}
	
	@DeleteMapping("/delete/{memberNo}")
	public ResponseEntity<String> memberDelete(@PathVariable("memberNo") int memberNo) {
		logger.info(logTitleMsg);
		logger.info("@DeleteMapping memberDelete: {}", memberNo);

		memberService.memberDeleteOne(memberNo);

		return ResponseEntity.ok("회원 삭제 성공");
	}
	
}
