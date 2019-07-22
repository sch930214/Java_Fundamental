package java_20190719;

public class Customer {
	public String name;
	public String email;
	public String phone;
	public int age;
	public double balance;
	public boolean isReleased;
	public static double interestRate; // 바깥에 공유되는 변수
	public static final String BANKNAME = "신한은행"; //Final 변수는 대부분 Static 변수로 생성

}
