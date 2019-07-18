package java_20190715;

public class CharLiteralDemo {
	public static void main(String[] args) {
		//char literal의 유니코드 표현 => '\u0000'
		char c1 = '\uc190';
		char c2 = '\uc815';
		char c3 = '\ud6c8';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//char literal의 아스키코드 표현 => 65
		
		char c4 = 65;
		System.out.println(c4);
		//char literal 아스키코드 48 = 0
		char c8 = 48;
		System.out.println(c8);
		
		//char literal의 문자표현 => ''
		
		char c5 = '%';
		System.out.println(c5);
		
		char c6 = '\"';
		
		// \n => line feed
		// \t => tab
		// \\ => back slash
		// \' => single quotation
		// \" => double quotation
		
		String path = "aa\nbb";
		System.out.println(path);
		
	}
}
