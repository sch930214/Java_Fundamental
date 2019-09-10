package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//Dao = Data Access Object
public class MemberDao {
	// 1.singleton 코딩

	static {
		try {

			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static MemberDao single;

	private MemberDao() {
		/*
		 * try { Class.forName("org.mariadb.jdbc.Driver"); } catch
		 * (ClassNotFoundException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); 생성자에다가 해줘도 된다. }
		 */
	}

	// 싱글톤은 외부에서 객체를 만들려면 무조건 getInstance - 생성자가 private이니까
	public static MemberDao getInstance() {
		if (single == null) {
			single = new MemberDao();
		}
		return single;
	}

	// Dto = Data Transfer Object >데이터를 전달할때는 object로 전달한다.
	public boolean insert(MemberDto m) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;

		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic? autoReconnect=true", "kic12", "kic12");
			// 바인딩 변수(?)는 반드시 컬럼 값에만 설정할 수 있다.(컬럼명,테이블명,set,where 등등 전부 안됨)
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(num, name, addr) ");
			sql.append("values(?,?,?) ");


			pstmt = con.prepareStatement(sql.toString());

			pstmt.setInt(index++, m.getNum());
			pstmt.setString(index++, m.getName());
			pstmt.setString(index, m.getAddr());

			pstmt.executeUpdate();
			isSuccess = true;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		return isSuccess;
	}
	
	public boolean update(MemberDto m) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic? autoReconnect=true", "kic12", "kic12");
			// 바인딩 변수(?)는 반드시 컬럼 값에만 설정할 수 있다.
			StringBuffer sql = new StringBuffer();
			sql.append("UPDATE member ");
			sql.append("SET NAME = ? , addr = ? ");
			sql.append("WHERE num = ? ");

			pstmt = con.prepareStatement(sql.toString());

			pstmt.setString(index++, m.getName());
			pstmt.setString(index++, m.getAddr());
			pstmt.setInt(index, m.getNum());

			pstmt.executeUpdate();
			isSuccess = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if ( pstmt != null) pstmt.close();
				if ( con != null) con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		return isSuccess;
	}

	public boolean delete(int num) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		int index = 1;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic? autoReconnect=true", "kic12", "kic12");
			// 바인딩 변수(?)는 반드시 컬럼 값에만 설정할 수 있다.
			StringBuffer sql = new StringBuffer();
			sql.append("DELETE FROM member ");
			sql.append("WHERE num = ? ");

			pstmt = con.prepareStatement(sql.toString());

			pstmt.setInt(index, num);
			pstmt.executeUpdate();
			isSuccess = true;

		} catch (SQLException e2) {
			e2.printStackTrace();
		} finally {
			try {
				if (pstmt != null)pstmt.close();
				if (con != null)con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}

		return isSuccess;

	}
	
	public ArrayList<MemberDto> select() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		int index = 1;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic? autoReconnect=true", "kic12", "kic12");
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT num, NAME, addr ");
			sql.append("FROM member; ");
			
			pstmt = con.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				index = 1; //while문 두번째 들어올때 index값은 4가 되므로 while문 안에서 1로 설정
				int num = rs.getInt(index++);
				String name = rs.getString(index++);
				String addr = rs.getString(index);
				list.add(new MemberDto(num,name,addr));
			}
			
			
			
		} catch (SQLException e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null)pstmt.close();
				if(con != null)con.close();
			} catch (SQLException e2) {
				
			}
		}
		return list;
	}
	
}
