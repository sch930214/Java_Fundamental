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
		
		ssn = ssn.concat("abcd"); //문자열 더해줌
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
		
		int index = ssn.indexOf("-"); //몇번째인지
		System.out.println(index);
		
		System.out.println(fileName.indexOf(".")); //앞에서부터 센다
		System.out.println(fileName.lastIndexOf(".")); //뒤에서부터 센다
		//111111-1111118abcd
		String first = ssn.substring(0,6);  //앞숫자 포함, 뒤숫자 불포함
		//String first = ssn.substring(0,ssn.indexOf("-"));  //특정문자열 왼쪽
		String second = ssn.substring(7); //숫자 포함한 뒤로 쭉 
		//String second = ssn.substring(ssn.indexOf("-")+1); //특정문자열 오른쪽 
		System.out.println(first);
		System.out.println(second);
	}
}	
