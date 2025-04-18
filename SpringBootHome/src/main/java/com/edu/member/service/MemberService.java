package com.edu.member.service;

import java.util.List;

import com.edu.member.domain.MemberVo;

public interface MemberService {

	public List<MemberVo> memberSelectList();
	public MemberVo memberExist(String email, String password);
	public int memberInsertOne(MemberVo memberVo);
	public MemberVo memberSelectOne(int memberNo);
	
	public int memberUpdateOne(MemberVo memberVo);
	
	public int memberDeleteOne(int no);
}
