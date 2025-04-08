package com.edu.freeBoard.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.edu.freeBoard.domain.FreeBoardVo;
import com.edu.freeBoard.service.FreeBoardService;
import com.edu.util.Paging;



@RestController
@RequestMapping("/freeBoard")
public class FreeBoardController {

	private Logger logger = LoggerFactory.getLogger(FreeBoardController.class);
	private final String logTitleMsg = "==자유게시판 Control==";
	
	@Autowired
	private FreeBoardService freeBoardService;
	
	@RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
	public ModelAndView freeBoardList(@RequestParam(defaultValue = "1") int curPage) {
		logger.info(logTitleMsg);
		logger.info("RequestMethod.GET freeBoardList/ curPage: {}", curPage);
		
		int totalCount = freeBoardService.freeBoardSelectTotalCount();
		
		Paging pagingVo = new Paging(totalCount, curPage);
		
		int start = pagingVo.getPageBegin();
		int end = pagingVo.getPageEnd();
		
		List<FreeBoardVo> freeBoardList = 
			freeBoardService.freeBoardSelectList(start, end);
		
		Map<String, Object> pagingMap = new HashMap<>();
		pagingMap.put("totalCount", totalCount);
		pagingMap.put("pagingVo", pagingVo);
		
		ModelAndView mav = new ModelAndView("freeBoard/freeBoardListView");
		mav.addObject("freeBoardList", freeBoardList);
		mav.addObject("pagingMap", pagingMap);
		
		return mav;
	}
	
	@PostMapping("/")
	public ResponseEntity<Map<String, String>> 
		freeBoardInsertCtr(@ModelAttribute FreeBoardVo freeBoardVo,
			MultipartHttpServletRequest mhr){
		logger.info(logTitleMsg);
		logger.info("@PostMapping freeBoardInsertCtr freeBoardVo: {}", freeBoardVo);
		
		try {
			freeBoardService.freeBoardInsertOne(freeBoardVo, mhr);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.info("자유게시판 추가에서 문제 발생");
			e.printStackTrace();
		}
		
		Map<String, String> resultMap = new HashMap<>();
		resultMap.put("result", "success");
		
		return ResponseEntity.ok(resultMap);
	}
	
	// 게시판 수정 화면 생성
	@GetMapping("/{freeBoardId}")
	public ResponseEntity<FreeBoardVo> 
		freeBoardUpdate(@PathVariable int freeBoardId){
		logger.info(logTitleMsg);
		logger.info("@GetMapping freeBoardUpdate freeBoardId: {}", freeBoardId);
		
		FreeBoardVo freeBoardVo = freeBoardService.freeBoardSelectOne(freeBoardId);
		
		return ResponseEntity.ok(freeBoardVo);
	}
	
	// 게시판 수정 db
	@PatchMapping("/{freeBoardId}")
	public ResponseEntity<?> 
		freeBoardUpdateCtr(@PathVariable int freeBoardId, 
			@RequestBody FreeBoardVo freeBoardVo){
		logger.info(logTitleMsg);
		logger.info("@PatchMapping freeBoardUpdateCtr "
			+ "freeBoardId: {}, freeBoardVo: {}", freeBoardId, freeBoardVo);
		
		if(freeBoardVo.getMemberNo() == 0) {
			Map<String, String> errorResponseMap = new HashMap<>();
			errorResponseMap.put("errorMsg", "게시판 ID가 일치하지 않습니다.");
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST)
				.contentType(MediaType.APPLICATION_JSON).body(errorResponseMap);
		}
		
		System.err.println("??있나? " + freeBoardVo.getMemberNo());
		
		freeBoardService.freeBoardUpdateOne(freeBoardVo);
		freeBoardVo = freeBoardService.freeBoardSelectOne(freeBoardId);
		
		return ResponseEntity.ok(freeBoardVo);
	}
}
