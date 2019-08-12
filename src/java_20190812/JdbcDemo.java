package java_20190812;

public class JdbcDemo {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("Driver Load Success...");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Load Fail...");
		}
		
	}
}
