package com.edu.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.edu.auth.controller.AuthController;
import com.edu.member.dao.MemberDao;
import com.edu.member.domain.MemberVo;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	public MemberDao memberDao;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public List<MemberVo> memberSelectList(){
		
		return memberDao.memberSelectList();
	}

	@Override
	public MemberVo memberExist(String email, String password) {
		// TODO Auto-generated method stub
		MemberVo memberVo = memberDao.memberExist(email, password);
		
		if(memberVo != null && passwordEncoder.matches(password
			, memberVo.getPassword())) {
			return memberVo;
		}
		
		return null;
	}

	@Override
	public int memberInsertOne(MemberVo memberVo) {
		String pwdEncoder = passwordEncoder.encode(memberVo.getPassword());
		System.out.println("비번 확인: " + memberVo.getPassword() 
			+ " / " + pwdEncoder);
		
		memberVo.setPassword(pwdEncoder);
		
		return memberDao.memberInsertOne(memberVo);
	}

	@Override
	public MemberVo memberSelectOne(int memberNo) {
		// TODO Auto-generated method stub
		return memberDao.memberSelectOne(memberNo);
	}

	@Override
	public int memberUpdateOne(MemberVo memberVo) {
		// TODO Auto-generated method stub
		return memberDao.memberUpdateOne(memberVo);
	}
	
	@Override
	public int memberDeleteOne(int no) {
		// TODO Auto-generated method stub
		return memberDao.memberDeleteOne(no);
	}
}
