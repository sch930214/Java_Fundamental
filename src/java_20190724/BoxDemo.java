package java_20190724;

public class BoxDemo {
	int a;
	static int x;
	
	public static void main(String[] args) {
		
		//Box.NAME = "Box2";
		//a = 10;       //이거 안됨. 사용하려면 객체 생성해서 메모리를 올려놓으면 됨.
		BoxDemo b = new BoxDemo();
		b.a = 10;                       //요렇게. static  변수는 가능
		
		x = 20;  //더 좋은 방법은
		BoxDemo.x = 20;
		
		
		
		
		
		
		
		
		Box b1 = new Box();
		b1.width = 10;
		b1.height = 20;
		b1.depth = 30;
		
		Box b2 = new Box();
		b1.width = 10;
		b1.height = 20;
		b1.depth = 30;
		
		
											//b1 == b2 => reference 비교는 value 비교와 달리 두 클래스가 같은 오브젝트를 참조해야 true.
		System.out.println(b1 == b2);    //false!!! object 내용이 같은게 중요한게 아니라 같은 object를 참조하느냐가 포인트.
		
		Box b3 = b2;
		
		System.out.println(b2 == b3);	//b2와 b3가 같은 곳 참조.
		
		System.out.printf("width : %d, height : %d, depth : %d%n", b1.width, b1.height, b1.depth);
		
		b1.change(b1); //call by reference. b가 b1이 가리키는 오브젝트를 가리키게 됨.
						//Box b = b1;
		System.out.printf("width : %d, height : %d, depth : %d%n", b1.width, b1.height, b1.depth);
	}
}
