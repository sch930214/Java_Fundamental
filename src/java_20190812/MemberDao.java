package java_20190812;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//Dao = Data Access Object
public class MemberDao {
	//1.singleton 코딩
	
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
		/*try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	생성자에다가 해줘도 된다.
		}*/
	}
	//싱글톤은 외부에서 객체를 만들려면 무조건 getInstance - 생성자가 private이니까
	public static MemberDao getInstance() {
		if(single == null) {
			single = new MemberDao();
		}
		return single;
	}
	//Dto = Data Transfer Object >데이터를 전달할때는 object로 전달한다.
	public boolean insert(MemberDto m) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean isSuccess = false;
		
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic? autoReconnect=true","kic12","kic12");
			StringBuffer sql = new StringBuffer();
			sql.append("insert into member(num, name, addr) ");
			sql.append("values(?,?,?)");
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, m.getNum());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getAddr());
			
			pstmt.executeUpdate();
			isSuccess = true;
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(con != null) con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
		
		
		return isSuccess;
	}
}
