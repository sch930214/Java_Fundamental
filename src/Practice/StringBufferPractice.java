package Practice;

public class StringBufferPractice {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("hello world java");
		
		sb.append("hi"); 					//append 뒤에다 추가
		sb.insert(0,"4");					//insert(i,j) i번째에 j를 추가
		sb.insert(3,"6");
		sb.insert(8,"16");
		
		
		System.out.println(sb);
		System.out.println(sb.substring(3));  //substring(i) i를 포함한 뒤의 것들을 출력
		System.out.println(sb.substring(1,5));	//substring(x,y) x번째부터 y번째까지의 문자열 출력 
	}
}
