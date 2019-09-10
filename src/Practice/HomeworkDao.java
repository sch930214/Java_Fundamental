package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class HomeworkDao {
	
	static {
		try {

			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private static HomeworkDao single;

	private HomeworkDao() {

	}

	public static HomeworkDao getInstance() {
		if (single == null) {
			single = new HomeworkDao();
		}
		return single;
	}
	
	public boolean insert(HomeworkDto h) {
		boolean isSuccess = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		int index = 1;

		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost/kic? autoReconnect=true", "kic12", "kic1234");
			StringBuffer sql = new StringBuffer();
			sql.append("INSERT INTO member(m_seq,m_id,m_password) ");
			sql.append("VALUES(?,?,PASSWORD(?)) ");

			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(index++, h.getSeq());
			pstmt.setString(index++, h.getId());
			pstmt.setString(index++, h.getPwd());
			
			pstmt.executeUpdate();
			isSuccess = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)con.close();
				if (pstmt != null)pstmt.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}

		return isSuccess;
	}
}
