package java_20190729;

public class ImplementClassDemo {
	public static void main(String[] args) {
		//Interface, 추상클래스 전부 객체생성 불가능하므로 자식이용
		InterA i = new ImplementClass ();
		i.mA();
		i.mB();
		i.mC();
		//InterA.PI = 3.15;  이런거 안됨. final 변수이므로
		System.out.println(InterA.PI);
	}
}
