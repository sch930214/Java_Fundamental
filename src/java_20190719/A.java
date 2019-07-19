package java_20190719;
//public은 (확장자를 뺀) 파일이름과 동일한 클래스에만 추가할 수 있다. ex.A
public class A {
	String name;
	int age;
	
	public void m() {
		System.out.println("m() 메서드");
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.name = "성영한";
		a.age = 20;
		
		System.out.println(a.name);
		System.out.println(a.age);
		
		a.m();
	}
}

	/*public static void main(String[] args) {
		System.out.println("Hello1");


class B{
	{
	/* public이 여기 있으면 실행안됨.
	public static void main(String[] args) {
		System.out.println("Hello");
	*/ //	
		
		//main 메서드가 실행되기 위해서는  public이 추가된 클래스애서만 작동됨
		//main 메서드가 실행되기 위해서는  파일이름과 동일한 클래스애서만 작동됨
		
		
	
