package java_20190724.aa;

public class Test {
	//public Test(){} //생성자
	public static void main(String[] args) { //여기에 위치해야지 밑에 다른 클래스에 main메서드가 있으면 실행 불가능
		System.out.println("Hello");
	}
}


//Test1, Test2 클래스는 Test.java파일 안에서 선언은 가능하나 서로 다른 패키지에서 사용할 수 없다.
//Test1, Test2 클래스를 서로 다른 패키지에서 사용하기 위해서는 각각 별도의 파일을 만들어 접근 한정자를 public으로 선언하여 사용해야 한다.


class Test1{		//같은 클래스 내에서 사용하기 위한 클래스
					//public 부여 불가능, 붙이면 에러뜸, 공개목적x
//	public static void main(String[] args) {
//		System.out.println("Hello");
//	}     이거 사용 불가능.
}

class Test2{
	
}