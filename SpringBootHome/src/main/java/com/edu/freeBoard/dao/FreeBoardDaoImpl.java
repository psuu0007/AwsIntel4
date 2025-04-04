package com.edu.freeBoard.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.freeBoard.domain.FreeBoardVo;

@Repository
public class FreeBoardDaoImpl implements FreeBoardDao{

	@Autowired
	private SqlSession sqlSession;
	
	String namespace = "com.edu.freeBoard.";
	
	@Override
	public List<FreeBoardVo> freeBoardSelectList(int start, int end) {
		Map<String, Object> map = new HashMap<>();
		map.put("start", start);
		map.put("end", end);
		
		return sqlSession.selectList(namespace + "freeBoardSelectList", map);
	}

	@Override
	public int freeBoardSelectTotalCount() {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(namespace + "freeBoardSelectTotalCount");
	}

}
