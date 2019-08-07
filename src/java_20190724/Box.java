package java_20190724;

public class Box {
	int width;
	int height;
	int depth;
	//final 변수는 멤버변수 위치에서 초기화해야 함.
	//한번 정해지면 변경 불가
	//final 변수명은 대문자로 하는 것이 관례 (NAME)
	//final 변수는 변수의 특성상  인스턴스 변수로 처리하지않고 static 변수로 처리함.
	static final String NAME = "BOX";

	
	public void change(Box b) {//Box b = b1;
		int test = 0;                          //int test; xx
		
		//메서드 내의 매개변수(Box b, change)를 포함한 사용자가 정의한 변수(int a, int c)를 지역변수라고 한다.
		//지역변수는 자동으로 초기화 되지 않기 때문에 기본값을 저장하고 사용한다.
		//지역변수의 유효범위는 메서드 내에서만 사용 가능
		//
		//int a ;
		//int c = a + 4;     //에러뜸. int a는 초기값이 설정이 안되어 있어서.
		
		int c = width + 4; //이건 가능. width초기값이 제시되기 때문에
		
		String str = null;
		double d = 0.0;					
		
		System.out.println(c);
		//System.out.println(test);                //지역변수는 0이라고 선언해줘야된다. 지역변수는 초기화설정 안해줌.
		b.depth = 3000;
		
	}
	
	
}
