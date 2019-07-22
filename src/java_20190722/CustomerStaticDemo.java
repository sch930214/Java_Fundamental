package java_20190722;

import java_20190719.Customer;

public class CustomerStaticDemo {
	public static void main(String[] args) {
		Customer c1 = new Customer(); // 그냥 하면 에러 뜸. 해당 패키지에 Customer 클래스가 없어서 다른데서 import
		c1.name = "홍길동";
		c1.age = 40;
		c1.email = "kdhong@test.com";
		c1.phone = "010-8080-0987";
		c1.balance = 190000.43;
		c1.isReleased = false;
		// c1.interestRate = 3.5; 이렇게 작성할 시 마치 instance 변수 같으므로, 밑에처럼 클래스 변수 이름으로 설정하는 것이 훨씬 낫다.
		// static변수는 클래스 이름으로 접근한다.
		//c1.BANKNAME = "신한은행"; final 변수는 정해놓았으므로 (같은 문자열이라도) 할당 자체가 되지 않음.
		//static변수는 클래스 이름으로 접근하는 것이 관례이지만 reference로도 접근이 가능하다(권장하지 않음)
		Customer.interestRate = 3.7;

		Customer c2 = new Customer();
		c2.name = "아무개";
		c2.age = 50;
		c2.email = "noname@test.com";
		c2.phone = "010-2345-9876";
		c2.balance = 3500000.45;
		c2.isReleased = false;

		System.out.println(Customer.interestRate); // c2.interestRate로 출력해도 나옴.

		Customer c3 = new Customer();
		c3.name = "배조스";
		c3.age = 62;
		c3.email = "jaws@amazon.com";
		c3.phone = "010-1111-1111";
		c3.balance = 12000000000.45;
		c3.isReleased = true;

		System.out.println(Customer.interestRate);
	}
}
