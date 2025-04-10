package com.edu.freeBoard.service;

import java.util.HashMap;
import java.util.Iterator;
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

import jakarta.transaction.Transactional;

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
		//게시판 4
		
		List<Map<String, Object>> fileList = 
			fileUtils.parseInsertFileInfo(freeBoardVo.getFreeBoardId(), mhr);
		
		for (int i = 0; i < fileList.size(); i++) {
			freeBoardDao.freeBoardFileInsertOne(fileList.get(i));
		}
	}

	@Override
	public Map<String, Object> freeBoardSelectOne(int freeBoardId) {
		// TODO Auto-generated method stub
		
		Map<String, Object> resultMap = new HashMap<>();
		
		FreeBoardVo freeBoardVo = freeBoardDao.freeBoardSelectOne(freeBoardId);
		resultMap.put("freeBoardVo", freeBoardVo);

		// 게시판 뿐만 아니라 자식 테이블 정보도 가져와야 함
		List<Map<String, Object>> freeBoardFileList = 
			freeBoardDao.freeBoardFileSelectList(freeBoardId);
		resultMap.put("freeBoardFileList", freeBoardFileList);
		
		return resultMap;
	}

	@Transactional
	@Override
	public void freeBoardUpdateOne(FreeBoardVo freeBoardVo
		, MultipartHttpServletRequest mhr
		, List<Integer> delFreeBoardFileIdList) throws Exception {
		// TODO Auto-generated method stub
		freeBoardDao.freeBoardUpdateOne(freeBoardVo);
		
		int parentSeq = freeBoardVo.getFreeBoardId();
		
		// 기존 데이터 삭제하는 경우 or 수정하지 않는 경우
		if(delFreeBoardFileIdList != null) {
			List<Map<String, Object>> tempFileList = 
				freeBoardDao.fileSelectStoredFileName(delFreeBoardFileIdList);
			
			freeBoardDao.deleteFileByFreeBoardFileIds(delFreeBoardFileIdList);
			if(tempFileList != null) {
				fileUtils.parseDeleteFileInfo(tempFileList);
			}
		}
		
		// 파일 추가 로직
		List<Map<String, Object>> fileInsertList = 
			fileUtils.parseInsertFileInfo(parentSeq, mhr);
		
		if(fileInsertList.isEmpty() == false) {
			for (Map<String, Object> map : fileInsertList) {
				freeBoardDao.freeBoardFileInsertOne(map);
			}
		}
	}

}
