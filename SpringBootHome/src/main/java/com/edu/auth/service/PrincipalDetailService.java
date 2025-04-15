package com.edu.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.edu.auth.domain.PrincipalDetails;
import com.edu.member.dao.MemberDao;
import com.edu.member.domain.MemberVo;

@Service
public class PrincipalDetailService implements UserDetailsService{

	@Autowired
	private MemberDao memberDao;

	@Override
	public UserDetails loadUserByUsername(String email) 
		throws UsernameNotFoundException {
		
		MemberVo memberVo = memberDao.findMemberByEmail(email);
		
		if(memberVo == null) {
			return null;
		}
		
		return new PrincipalDetails(memberVo);
	}
	
	
}
