package com.edu.member.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.member.domain.MemberVo;

@Repository
public class MemberDaoImpl implements MemberDao{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<MemberVo> memberSelectList() {
		// TODO Auto-generated method stub
		
		return sqlSession.selectList("com.edu.member.memberSelectList");
	}

	@Override
	public MemberVo memberExist(String email, String password) {
		// TODO Auto-generated method stub
		HashMap<String, String> paramMap = new HashMap<>(); 
		
		paramMap.put("email", email);
		paramMap.put("pwd", password);
		
		return sqlSession.selectOne("com.edu.member.memberExist", paramMap);
	}

	@Override
	public int memberInsertOne(MemberVo memberVo) {
		// TODO Auto-generated method stub
		return sqlSession.insert("com.edu.member.memberInsertOne"
			, memberVo);
	}

}
