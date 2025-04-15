package com.edu.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService;
import org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest;
import org.springframework.security.oauth2.core.OAuth2AuthenticationException;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Service;

import com.edu.auth.domain.PrincipalDetails;
import com.edu.member.dao.MemberDao;
import com.edu.member.domain.MemberVo;

@Service
public class PrincipalOauth2UserService extends DefaultOAuth2UserService{

	private final PasswordEncoder passwordEncoder = 
		new BCryptPasswordEncoder();
	
	@Autowired
	private MemberDao memberDao;
	
	@Override
	public OAuth2User loadUser(OAuth2UserRequest userRequest) 
		throws OAuth2AuthenticationException{
		System.out.println("구글 정보 확인: " 
			+ userRequest.getAccessToken().getTokenValue());
		System.out.println("구글 정보 확인: " 
				+ super.loadUser(userRequest).getAttributes());
		
		OAuth2User oAuth2User = super.loadUser(userRequest);
		
		String provider = userRequest.getClientRegistration()
			.getClientId();
		
		String password = "{noop}oauth2-user";
		String email = oAuth2User.getAttribute("email");
		String memberName = oAuth2User.getAttribute("name");
		
		MemberVo memberVo = memberDao.googleMemberExist(email);
		if(memberVo == null) {
			System.out.println("최초 구글 로그인 / 가입");
			
			memberVo = new MemberVo();
			memberVo.setEmail(email);
			memberVo.setMemberName(memberName);
			memberVo.setPassword(password);
			memberVo.setProvider(provider);
			
			memberDao.memberInsertOne(memberVo);
		}else {
			System.out.println("이미 존재하는 회원입니다.");
		}
		
		return new PrincipalDetails(memberVo, oAuth2User.getAttributes());
	}
}
