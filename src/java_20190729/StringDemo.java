package java_20190729;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String("test");
		String s2 = new String("test");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		String ssn = "111111-1111118";
		char c = ssn.charAt(6); //문자열 중에 특정 문자 하나를 추출
		System.out.println(c);
		
		ssn = ssn.concat("abcd"); //문자열 더해줌 그냥 + "" 가 쉽긴 함.
		System.out.println(ssn);
		
		String fileName = "abc.abc.asweruiopweho.doc";
		if(fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
			
		}else if (fileName.endsWith("doc")) {
			System.out.println("워드 문서 입니다.");
			
		}else {
			System.out.println("파일 입니다.");
		}
		
		System.out.println(fileName.equalsIgnoreCase("ABD.DOc"));
		
		//
		
		int index = ssn.indexOf("-"); //몇번째인지
		System.out.println(index);
		
		System.out.println(fileName.indexOf(".")); //앞에서부터 센다
		System.out.println(fileName.lastIndexOf(".")); //뒤에서부터 센다
		//111111-1111118abcd
		//substring(int first, int second)
		//first(포함)부터, second(포함 하지않음) 사이의 문자열을 추출
		//substring(int first)
		//first(포함)이후의 문자열 모두 추출.
		String first = ssn.substring(0,6);  //앞숫자 포함, 뒤숫자 불포함
		//String first = ssn.substring(0,ssn.indexOf("-"));  //특정문자열 왼쪽
		String second = ssn.substring(7); //숫자 포함한 뒤로 쭉 
		//String second = ssn.substring(ssn.indexOf("-")+1); //특정문자열 오른쪽 
		System.out.println(first);
		System.out.println(second);
		
		String html = "안녕하세요\n저는 손정훈 입니다.\n잘 부탁드립니다.";
		//replaceAll(String first, String second)
		//first 문자열을 second 문자열로 대체한다.
		html = html.replaceAll("\n","<br>");
		System.out.println(html);
	
	
		String url = "http://www.naver.com";
		String path = "/news/sdfsdf.do?id=123&cat=1010";
		//startsWith(String msg) msg문자열로 시작하면 true, or false
		if(path.startsWith("/news")) {
			System.out.println("뉴스 페이지 입니다.");
		}else if(path.startsWith("/sports")) {
			System.out.println("스포츠 페이지 입니다.");
		}else {
			System.out.println("페이지가 존재하지 않습니다.");
		}
		
		String m1 = "hello";
		String m2 = "hello ";
		System.out.println(m1.length());
		System.out.println(m2.length());
		//trim => 빈 공백을 없애줌.
		if(m1.equals(m2.trim())) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}	
		
		//toUpperCase() 대문자로 변환
		m1 = m1.toUpperCase();
		System.out.println(m1);
		
		//toLowerCase() 소문자로 변환
		m1 = m1.toLowerCase();
		System.out.println(m1);
		
		//String.valueOf() : primitive data type을 문자열로 바꿔줌.
		int a = 10;
		String str = String.valueOf(a);
		System.out.println(str);
		
		char[] c1 = {'a','b','c'};
		String str1 = String.valueOf(c1,1,1);
		System.out.println(str1);
	
		//ssn : 111111-1111118
		//split(String delimiter)
		
		//ㅣ문자열을 구분자( delimiter)로 토큰(token)화 시키는 메서드
		String[] strArray = ssn.split("-");
		System.out.println(strArray[0]);
		System.out.println(strArray[1]);
		
		
		String str2 = String.format("%,.2f",1234.12512);
		System.out.println(str2);
		
		str2 = String.format("%,d", 1000000);
		System.out.println(str2);
	}
}	
