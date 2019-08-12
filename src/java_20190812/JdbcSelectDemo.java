package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic? autoReconnect=true","kic12","kic12");
			
			StringBuffer sql = new StringBuffer();
			sql.append("select num,name,addr ");
			sql.append("from member");
			
			pstmt = con.prepareStatement(sql.toString());
			//select 문을 경우에는 executeQuery()를 사용한다.
			rs = pstmt.executeQuery();
			//커서가 컬럼에 있다가 next() 메서드에 의해 데이터가 있는 행(row)로 이동
			//만약 row가 존재하면 true, 존재하지 않으면 false.
			while(rs.next()) {
				int num = rs.getInt(1);
				String name = rs.getString(2);
				String addr = rs.getString(3);
				
				System.out.printf("번호 : %d , 이름 : %s , 주소 : %s%n", num, name, addr);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}
}
