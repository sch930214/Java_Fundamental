package java_20190724;
//i18n => 국제화 I nternationalizatio n //program 개발자들
//l10n => 지역화 L ocalizatio n
public class InitializationDemo {
	int a;                                //생성자에서 초기화
	static int b;                         //static에서
	
	//static 초기화
	static {
		System.out.println("static area");//1
		b = 100;
		//a = 10; 이런거 안됨. instance 변수 초기화는 생성자에서.
	}
	
	
	
	
	static final int c = 10; //final이라 정해줘야됨. //그자리에서
	
	//생성자에서 초기화 할 수 있는 변수는 instance 변수
	public InitializationDemo(int a) {
		this.a = a;
		
		
		//c = 20; //못바꿈. 멤버변수 있는 위치에서 초기화
	}
	
	
	public static void main(String[] args) {//2
		System.out.println("main area");
		InitializationDemo i = new InitializationDemo(1000);//3
		System.out.println(i.a);
		System.out.println(b);
		System.out.println(c);
	}
}
