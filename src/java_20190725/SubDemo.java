package java_20190725;

public class SubDemo {
	public static void main(String[] args) {
		Sub s1 = new Sub();
		s1.makeMoney();//부모의 메서드
		s1.gotoSchool();
		s1.play("starcraft");//부모의 메서드를 overriding(재정의)
		
		s1.money = 1000000;
		s1.chicken = "교촌치킨2마리";
		
		System.out.println(s1.money + "원이 있다.");
		
		
		//둘 다 일반클래스일때는 쓰지 않음. Super가 추상클래스 혹은 인터페이스 일때 사용.(추상클래스나 인터페이스는 객체 생성이 불가능해서 [new가 불가능])
		Super s2 = new Sub();                                      //s2가 부모 object를 가리킴.
		s2.makeMoney();//부모의 메서드                                                          //따라서 자식꺼 호출 불가능
		//s2.gotoSchool();                                           //하지만 Overriding된 변수,메서드는 호출 가능
		s2.play("starcraft");//부모의 메서드를 overriding(재정의)
		
		s2.money = 1000000;
		//s2.chicken = "교촌치킨2마리";
	}
}
