package java_20190725;

public class Child extends Parent {
	static {
		staticChild = 200;
		System.out.println("Child static 초기화");
	}

		public void m() {
			phone = ""; //가능
			System.out.println(phone);
	
		}
	
		public static void m1() {
		//phone = ""; 불가능 => 메모리가 없으니까
	}
	static int staticChild;

	String phone;
	{
		
		System.out.println(phone);
		System.out.println("Child instance block");
	
	}

	public Child() {
		//super();
		System.out.println("Child 생성자");
	}
	
	public static void main(String[] args) {
		m1();
		Child c = new Child();
		c.m();
	}
	
}
