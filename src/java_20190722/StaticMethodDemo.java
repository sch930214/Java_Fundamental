package java_20190722;

public class StaticMethodDemo {
	String name;
	static double interestRate;
	
	public void m1() {
		System.out.println("m1() 메서드 호출");
	}
	public void m2() { //<= instance method
		//instance method에서는 instance 변수, static 변수 사용 가능
		//instance method, static method 호출 가능
		this.name = "성영한";
		StaticMethodDemo.interestRate = 0.1;
		this.m1();
		StaticMethodDemo.m3();
	}
	
	public static void m3() {
		System.out.println("m3() 메서드 호출");
	}
	public static void m4() { //<= static method
		//static method에서는 this를 사용할 수 없음.
		//static method에서는 instance 변수 사용 불가능, static 변수 사용 가능
		//instance method 호출 불가능, static method 호출 가능
		//name = "홍길동";
		interestRate = 0.2;
		//m1();
		m3();
		
	}
	public static void main(String[] args) {
		StaticMethodDemo.m3();
		StaticMethodDemo.m4();
		StaticMethodDemo.interestRate = 1.4; //<=static 변수
		//name = "sdfsdf"; //<= instance 변수는 객체 생성하지 않으면 사용 불가능
		StaticMethodDemo s1 = new StaticMethodDemo();
		s1.m1();
		s1.m2();
		s1.name = "sdfsdf"; //<= 객체 생성 [StaticMethodDemo s1 = new StaticMethodDemo();] 후에 사용가능
	}
}
