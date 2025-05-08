package com.edu.home.apple.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.home.apple.dto.AppleDto;

@Repository
public class AppleDaoImpl implements AppleDao{

	@Autowired
	private SqlSession sqlSession;

	@Override
	public AppleDto appleSelectOne(int fruSeq) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("com.edu.home.apple.appleSelectOne"
			, fruSeq);
	}
	
}
