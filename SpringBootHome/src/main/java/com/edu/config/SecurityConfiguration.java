package com.edu.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.SecurityFilterChain;

import jakarta.servlet.DispatcherType;
import jakarta.servlet.RequestDispatcher;

@Configuration
public class SecurityConfiguration {

	@Autowired
	private PrincipalOauth2UserService principalOAuth2UserService;
	
	// 각 주소들 접근 권한 줄까 말까 설정하는 영역
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) 
		throws Exception {
		return http
			.csrf(csrf -> csrf.disable())
			.authorizeHttpRequests(auth -> {
				auth
					.dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
				.requestMatchers("/", "/auth/**", "/resources/**", "/member/add")
					.permitAll()
				.anyRequest().authenticated();
			})
			.formLogin(form -> form // 로그인 관련 설정
				.loginPage("/auth/login")
				.loginProcessingUrl("/login")
				.usernameParameter("email")
				.passwordParameter("password")
				.successHandler((request, response, authentication) -> {
					PrincipalDetails userDetails = 
						(PrincipalDetails)authentication.getPrincipal();
					MemberVo memberVo = userDetails.getMemberVo();
					request.getSession().setAttribute("member", memberVo);
					
					response.sendRedirect("/member/list");
				})
				.failureHandler((request, response, exception) -> {
					System.out.println("로그인 실패! 이유: " + exception.getMessage());
					response.sendRedirect("/auth/loginFailView");
				})
				.permitAll()
			) // formLogin end
			.oauth2Login(oauth2login -> oauth2login // OAuth2 로그인 설정
				.loginPage("/auth/login")
	.userInfoEndpoint(userInfo -> userInfo.userService(principalOAuth2UserService))
				.successHandler((request, response, authentication) -> {
	PrincipalDetails userDetails = (PrincipalDetails)authentication.getPrincipal();
			request.getSession().setAttribute("member", userDetails.getMemberVo());
					response.sendRedirect("/member/list");
				})
			) // oauth2Login end
			.logout(logout -> logout
				.logoutUrl("/auth/logout")
				.logoutSuccessHandler((request, response, authentication) -> {
					request.getSession().invalidate();
					SecurityContextHolder.clearContext();
					
	RequestDispatcher dispatcher = request.getRequestDispatcher("/auth/logoutView");
					dispatcher.forward(request, response);
				})
			) // logout 종료
			.build();
	} // securityFilterChain 종료
}
