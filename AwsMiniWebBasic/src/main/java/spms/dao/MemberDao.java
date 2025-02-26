package spms.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import spms.dto.MemberDto;

public class MemberDao {

	private Connection connection;
	
	public void setConnection(Connection conn) {
		this.connection = conn;
	}
	
	public List<MemberDto> selectList() throws Exception{
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<MemberDto> memberList = new ArrayList<MemberDto>();
		
		String sql = "";
		
		sql += "SELECT MNO, MNAME, EMAIL, CRE_DATE";
		sql += " FROM MEMBERS";
		sql += " ORDER BY MNO ASC";
		
		try {
			pstmt = connection.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			int no = 0;
			String name = "";
			String email = "";
			Date creDate = null;
			
			while (rs.next()) {
				no = rs.getInt("MNO");
				name = rs.getString("MNAME");
				email = rs.getString("EMAIL");
				creDate = rs.getDate("CRE_DATE");
				
				MemberDto memberDto = new MemberDto(no, name, email, creDate);
				
				memberList.add(memberDto);
						
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} // finally end
		
		return memberList;
	}
	
	// 회원 등록
	public int memberInsert(MemberDto memberDto) throws Exception{
		int result = 0;
		PreparedStatement pstmt = null;
		
		try {
			String email = memberDto.getEmail();
			String pwd = memberDto.getPassword();
			String name = memberDto.getName();
			
			String sql = "";
			sql += "INSERT INTO MEMBERS";
			sql += " (MNO, EMAIL, PWD, MNAME, CRE_DATE, MOD_DATE)";
			sql += " VALUES(MEMBERS_MNO_SEQ.NEXTVAL, ?, ?, ?, SYSDATE, SYSDATE)";	
			
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1, email);
			pstmt.setString(2, pwd);
			pstmt.setString(3, name);
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		} // finally 종료
		
		return result;
	}
	
}


