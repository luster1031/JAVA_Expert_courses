/*
 * visitor테이블을 활용한 방명록 웹 프로그램 작성
 * - crud
 * 
 * model
 * 	- VisitorVO.java
 * 	- VisitorDBServlet2.java
 * 	- MySQL.java
 *  - visitorDAO.java
 * */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import vo.VisitorVO;

public class VisitorDAO {
	public boolean c(VisitorVO vo) {
		boolean result = false;
		Connection conn = MySQL.connect();
		try (PreparedStatement pstmt = conn
				.prepareStatement("insert into visitor (name, writedate, memo) values (?, now(), ?)")) {
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMemo());
			pstmt.executeUpdate();
			result = true;			
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQL.close(conn);
		return result;
	}
	// read메서드 - 전체 리스트 꺼내기
	public List<VisitorVO> r() {
		Connection conn = MySQL.connect();
		List<VisitorVO> vlist = null;
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(
					"select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate, memo from visitor order by writedate desc");
			vlist = new ArrayList<VisitorVO>();
			VisitorVO vo = null;
			while (rs.next()) {
				vo = new VisitorVO();
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setWriteDate(rs.getString("writedate"));
				vo.setMemo(rs.getString("memo"));
				vlist.add(vo);
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQL.close(conn);
		return vlist;
	}
	// rOne메서드 - id값에 해당하는 하나만 꺼내기
	public VisitorVO rOne(int id) {
		Connection conn = MySQL.connect();
		VisitorVO vo = null;	//	vo초기화 해줘야함
		try (Statement stmt = conn.createStatement()) {
			ResultSet rs = stmt.executeQuery(
					"select id, name, date_format(writedate, '%Y년 %m월 %d일') writedate,"
					+ " memo from visitor order by writedate desc");
			if(rs.next()) {
				vo = new VisitorVO();
				vo.setId(rs.getInt("id"));
				vo.setName(rs.getString("name"));
				vo.setWriteDate(rs.getString("writedate"));
				vo.setMemo(rs.getString("memo"));
			}
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQL.close(conn);
		return vo;
	}
	// update메서드
	public boolean u(VisitorVO vo) {
		boolean result = false;
		Connection conn = MySQL.connect();
		try (PreparedStatement pstmt = conn.prepareStatement(
				"update visitor set name = ?,  memo = ? where id = ?")) {
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getMemo());
			pstmt.setInt(3, vo.getId());
			pstmt.executeUpdate();		
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQL.close(conn);
		return result;
	}
	
	public boolean d(int id) {
		boolean result = false;
		Connection conn = MySQL.connect();
		try (PreparedStatement pstmt = conn.prepareStatement("delete from visitor where id = ?")) {
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			result = true;
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
		MySQL.close(conn);
		return result;
	}
}
