package java_20190723;

public class AdminDemo {
	public static void main(String[] args) {
		Admin a = new Admin("syh1011","1234");
		//a.email = "";  private이라서 값 설정 불가능
//		a.setId("syh1011");
//		a.setPwd("1234");
//		a.setEmail("syh@hbilab.org");
//		a.setLevel(1);  //이렇게 하나하나 설정하는 것 불편해. 그래서 생성자가 나옴.
		System.out.printf("%s,%s,%s,%d %n",a.getId(),a.getPwd(),a.getEmail(),a.getLevel());
	}
}
// this역할 -> 자기자신 객체, 다른 생성자 호출