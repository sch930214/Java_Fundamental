package java_20190715;

public class CharLiteralDemo {
	public static void main(String[] args) {
		//char literal�� �����ڵ� ǥ�� => '\u0000'
		char c1 = '\uc190';
		char c2 = '\uc815';
		char c3 = '\ud6c8';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		//char literal�� �ƽ�Ű�ڵ� ǥ�� => 65
		
		char c4 = 65;
		System.out.println(c4);
		//char literal �ƽ�Ű�ڵ� 48 = 0
		char c8 = 48;
		System.out.println(c8);
		
		//char literal�� ����ǥ�� => ''
		
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
