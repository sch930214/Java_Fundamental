package java_20190719;

public class FamilyMember {
	
	String name;
	String status;
	int age;
	
	public FamilyMember () {
		System.out.println("=======Class======");
	}
//	public void setInfo (String n, String s, int a) {
//		System.out.println("==========setInfo=======");
//		name = n;
//		status = s;
//		age = a;
//	
//	}
	
	public void getInfo () {
		System.out.println("===========getInfo=======");
		System.out.println("name : "+ name);
		System.out.println("status : " + status);
		System.out.println("age : "+ age);
	}
	public void getInfo(String n, String s, int a) {
		System.out.println("=====GGGetInfo======");
		System.out.println("name : " + n);
		System.out.println("status : " + s);
		System.out.println("age : " + a);
	}
	
}
