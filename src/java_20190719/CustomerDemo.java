package java_20190719;

public class CustomerDemo {
	public static void main(String[] args) {
		//Customer 객체 생성
		//Customer => Object type
		//c1 => reference
		//new Customer() => Object
		Customer c1 = new Customer();
		c1.name = "성영한";
		c1.age = 30;
		c1.email = "syh@hbilab.org";
		c1.phone = "010-3204-1703";
		c1.balance = 23_000_000_000.23;
		c1.isReleased = false;
		//%,f => 천단위로 ,찍혀서 출력 //%.2f => 소수점 둘째자리까지 출력 
		//%n 위치 주의
		System.out.printf("%s,%d,%s,%s,%,.2f,%s%n", c1.name, c1.age, c1.email, c1.phone, c1.balance, c1.isReleased);
		Customer c2 = new Customer();
		c2.name = "손정의";
		c2.age = 60;
		c2.email = "ceo@softbank.com";
		c2.phone = "010-9999-0000";
		c2.balance = 45_000_000_000.24;
		c2.isReleased = true;
		
		//primitive는 안되지만 reference는 가능
		Customer c3 = c2;
		
		System.out.printf("%s,%d,%s,%s,$%,.2f,%s%n", c2.name, c2.age, c2.email, c2.phone, c2.balance, c2.isReleased);
		c3.age = 61;
		System.out.printf("%s,%d,%s,%s,$%,.2f,%s%n", c3.name, c3.age, c3.email, c3.phone, c3.balance, c3.isReleased);
		
	}
}
