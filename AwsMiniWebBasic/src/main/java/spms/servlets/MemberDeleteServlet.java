package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import spms.dao.MemberDao;

@WebServlet(value = "/member/delete")
public class MemberDeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub

		Connection conn = null;

		int no = Integer.parseInt(req.getParameter("no"));

		try {
			ServletContext sc = this.getServletContext();

			conn = (Connection) sc.getAttribute("conn");

			MemberDao memberDao = new MemberDao();
			memberDao.setConnection(conn);

			int result = memberDao.memberDelete(no);

			if (result == 0) {
				System.out.println("회원 삭제가 정상처리 되지 않았습니다");
			}

			res.sendRedirect("./list");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			req.setAttribute("error", e);
			RequestDispatcher rd = req.getRequestDispatcher("/Error.jsp");
			rd.forward(req, res);
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		
	}

}
