package java_20190725;

public class Child extends Parent {
	static int staticChild;
	String phone;
	static {												//스태틱 블록
		staticChild = 200;
		System.out.println("Child static 초기화");
	}

	public void m() {											//메서드
		phone = ""; // 가능
		System.out.println(phone);

	}

	public static void m1() {									//메서드
		// phone = ""; 불가능 => 메모리가 없으니까
	}


	
	{																	//인스턴스 블록
		System.out.println(phone);
		System.out.println("Child instance block");
		child = 4;

	}

	public Child() {																	//생성자
		// super();
		System.out.println("Child 생성자");
	}

}
