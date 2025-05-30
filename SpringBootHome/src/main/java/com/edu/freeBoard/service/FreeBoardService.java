package com.edu.freeBoard.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.edu.freeBoard.domain.FreeBoardVo;

public interface FreeBoardService {
	public List<FreeBoardVo> freeBoardSelectList(int start, int end);
	public int freeBoardSelectTotalCount();
	
	public void freeBoardInsertOne(FreeBoardVo freeBoardVo, 
		MultipartHttpServletRequest mhr) throws Exception;
	
	public Map<String, Object> freeBoardSelectOne(int freeBoardId);
	
	public void freeBoardUpdateOne(FreeBoardVo freeBoardVo
		, MultipartHttpServletRequest mhr
		, List<Integer> delFreeBoardFileIdList) throws Exception;
	public void freeBoardDeleteOne(int freeBoardId, int memberNo);
	
}
