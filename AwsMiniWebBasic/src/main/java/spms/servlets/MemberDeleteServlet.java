package spms.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(value = "/member/delete")
public class MemberDeleteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		// TODO Auto-generated method stub

		req.setCharacterEncoding("UTF-8");

		Connection conn = null;
		PreparedStatement pstmt = null;

		ServletContext sc = this.getServletContext();

		String driver = sc.getInitParameter("driver");
		String url = sc.getInitParameter("url");
		String user = sc.getInitParameter("user");
		String password = sc.getInitParameter("password");

		int mNo = Integer.parseInt(req.getParameter("mNo"));

		String sql = "";

		try {
			Class.forName(driver);
			System.out.println("오라클 드라이버 로드");
			conn = DriverManager.getConnection(url, user, password);

			sql = "DELETE FROM MEMBERS";
			sql += " WHERE MNO = ?";

			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, mNo);

			pstmt.executeUpdate();

			res.sendRedirect("./list");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
		throws ServletException, IOException {
		
	}

}
