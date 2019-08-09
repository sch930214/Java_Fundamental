package java_20190725;

public class Parent {
	public int child;
	static int staticParent;
	String name;
	
	static {															//스태틱블록
		staticParent = 20;
		System.out.println("Parent static 초기화");
	}	
	
	
	{																					//인스턴스 블록
		System.out.println("Parent instance block");
	}
	
	public Parent() {															//생성자
		//super();
		System.out.println("Parent 생성자");
	}
}
