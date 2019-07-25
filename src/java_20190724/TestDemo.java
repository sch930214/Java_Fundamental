package java_20190724;
import java_20190724.aa.Test;   
								//Test 클래스를 import해서 사용하기 위해서는 Test클래스의 접근한정자는 public이어야 한다.
								//Test class가 default이기 때문에 같은 패키지가 아니면 공유 불가능
								//public class Test로 바꿔주면 에러 사라짐.
public class TestDemo {
	public static void main(String[] args) {
		Test t = new Test() ;              //new Test(); 생성자 호출 , 객체 생성, 변수 저장 but 접근한정자 때문에 에러
																					//생성자의 접근한정자가 default값이기 때문
																					//new Test();에 에러표시(빨간줄)
																					//생성자에 public추가하면 에러 사라짐.
										//전부다 빨간줄 에러 = Test (){}앞에 public 없는거
										
												//Test클래스 내에 생성자 없으면 compiler가 자동으로 default 생성자 만들어줘서 에러 x.
												//이 때 생성자의 접근 한정자는 클래스의 접근한정자와 동일하게 만들어 준다.
												//즉 public class Test이므로 public Test() {}가 만들어지는 것.
		
		//Math m = new Math ();   //이 생성자가 없거나 있는데 public이 아니거나 하면 에러.
	}
}
