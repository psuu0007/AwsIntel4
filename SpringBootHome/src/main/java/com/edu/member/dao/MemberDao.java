package com.edu.member.dao;

import java.util.List;

import com.edu.member.domain.MemberVo;

public interface MemberDao {

	public List<MemberVo> memberSelectList();
	public MemberVo memberExist(String email, String password);
	public int memberInsertOne(MemberVo memberVo);	
	public MemberVo memberSelectOne(int memberNo);
	
	public int memberUpdateOne(MemberVo memberVo);
	public int memberDeleteOne(int no);
	
	// 일반 계정 확인(비밀번호 없는 형태)
	public MemberVo findMemberByEmail(String email);
	// 구글 계정 확인
	public MemberVo googleMemberExist(String email);
}
