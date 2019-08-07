package java_20190724;
import java.lang.*;
public class Employee extends Customer {

	public Employee() {
		super();												//super가 있고 없고의 차이? 차이없음. super()의 ()안에는 생성자 초기화
	}
	
	String zipcode;
	String address1;
	String address2;
	String id;
	String pwd;
}
