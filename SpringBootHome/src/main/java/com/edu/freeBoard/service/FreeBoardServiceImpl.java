package com.edu.freeBoard.service;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.edu.freeBoard.dao.FreeBoardDao;
import com.edu.freeBoard.domain.FreeBoardVo;
import com.edu.util.FileUtils;

@Service
public class FreeBoardServiceImpl implements FreeBoardService{

	private Logger logger = LoggerFactory.getLogger(FreeBoardServiceImpl.class);
	private final String logTitleMsg = "==자유게시판 Service==";

	@Autowired
	public FreeBoardDao freeBoardDao;

	@Autowired
	private FileUtils fileUtils;
	
	@Override
	public List<FreeBoardVo> freeBoardSelectList(int start, int end) {
		// TODO Auto-generated method stub
		return freeBoardDao.freeBoardSelectList(start, end);
	}

	@Override
	public int freeBoardSelectTotalCount() {
		// TODO Auto-generated method stub
		return freeBoardDao.freeBoardSelectTotalCount();
	}

	@Override
	public void freeBoardInsertOne(FreeBoardVo freeBoardVo
		, MultipartHttpServletRequest mhr) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("게시판 정보 확인: " + freeBoardVo);
		freeBoardDao.freeBoardInsertOne(freeBoardVo);
		
		List<Map<String, Object>> fileList = 
			fileUtils.parseInsertFileInfo(freeBoardVo.getFreeBoardId(), mhr);
		
		for (int i = 0; i < fileList.size(); i++) {
			freeBoardDao.freeBoardFileInsertOne(fileList.get(i));
		}
	}

	@Override
	public FreeBoardVo freeBoardSelectOne(int freeBoardId) {
		// TODO Auto-generated method stub
		return freeBoardDao.freeBoardSelectOne(freeBoardId);
	}

	@Override
	public void freeBoardUpdateOne(FreeBoardVo freeBoardVo) {
		// TODO Auto-generated method stub
		freeBoardDao.freeBoardUpdateOne(freeBoardVo);
	}

}
