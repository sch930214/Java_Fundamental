package java_20190729;
//
public interface InterA extends InterB, InterC {
	//인터페이스의 변수 public static final이 생략되어 있음 - 생략은 가능하지만 관례적으로 전부 명시해줌.(a)
	double PI = 3.14;
	//인터페이스 메서드의 접근 한정자를 붙이지 않으면 public이 생략되어 있음-a
	//abstract 생략 가능 -a
 	void mA();
}
