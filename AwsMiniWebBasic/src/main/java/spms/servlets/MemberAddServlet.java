package spms.servlets;

import java.io.IOException;
import java.sql.Connection;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import spms.dao.MemberDao;
import spms.dto.MemberDto;

@WebServlet("/member/add")
public class MemberAddServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.sendRedirect("./MemberForm.jsp");
			
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("doPost 수행함");
		
		Connection conn = null;
		
		String emailStr = req.getParameter("email");
		String pwdStr = req.getParameter("password");
		String nameStr = req.getParameter("name");
		
		MemberDto memberDto = new MemberDto();
		
		memberDto.setEmail(emailStr);
		memberDto.setPassword(pwdStr);
		memberDto.setName(nameStr);
		
		try {
			ServletContext sc = this.getServletContext();
			
			conn = (Connection)sc.getAttribute("conn");

			MemberDao memberDao = new MemberDao();
			memberDao.setConnection(conn);
			
			int result = 0;
			
//			0이면 SQL 실패, 0이외에는 성공
			result = memberDao.memberInsert(memberDto);
			
			System.out.println("???????: " + result);
			if(result == 0) {
				
				System.out.println("회원가입 실패");
			}
			
			res.sendRedirect("./list");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			req.setAttribute("error", e);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/Error.jsp");
			dispatcher.forward(req, res);
		}
		
	}
	
}
