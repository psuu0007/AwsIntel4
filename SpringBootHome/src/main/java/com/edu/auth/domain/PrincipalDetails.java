package com.edu.auth.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;

import com.edu.member.domain.MemberVo;

// Oauth2 로그인 커스텀 마이징
public class PrincipalDetails implements UserDetails, OAuth2User{

	private MemberVo memberVo;
	private Map<String, Object> attributes;
	
	public PrincipalDetails(MemberVo memberVo) {
		this.memberVo = memberVo;
	}
	
	public PrincipalDetails(MemberVo memberVo, 
		Map<String, Object> attributes) {
		this.memberVo = memberVo;
		this.attributes = attributes;
	}
	
	@Override
	public Map<String, Object> getAttributes() {
		// TODO Auto-generated method stub
		return attributes;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return (String)attributes.get("name");
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		Collection<GrantedAuthority> collect = new ArrayList<>();
		collect.add(new GrantedAuthority() {
			
			@Override
			public String getAuthority() {
				// TODO Auto-generated method stub
				return memberVo.getMemberName();
			}
		});
		
		return collect;
	}
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return memberVo.getPassword();
	}
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return memberVo.getMemberName();
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	@Override
	public boolean isEnabled() {
		return true;
	}
	
	public MemberVo getMemberVo() {
		return memberVo;
	}
	
	
	
}
