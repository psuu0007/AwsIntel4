package com.edu.home.apple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.home.apple.dao.AppleDao;
import com.edu.home.apple.dto.AppleDto;

@Service
public class AppleServiceImpl implements AppleService{

	@Autowired
	private AppleDao appleDao;
	
	@Override
	public AppleDto appleSelectOne(int fruSeq) {
		// TODO Auto-generated method stub
		return appleDao.appleSelectOne(fruSeq);
	}

}
