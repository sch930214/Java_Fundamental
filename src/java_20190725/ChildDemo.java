package java_20190725;

public class ChildDemo {
	static int a = 0;																	//인스턴스 변수 선언
	static {																			//스태틱블록
		
		System.out.println("ChildDemo static 초기화");
	}
	public static void main(String[] args) {											//메인
		System.out.println("Main");
		Child c = new Child();															//객체 생성
		
		System.out.println(a);
		
	}
}
