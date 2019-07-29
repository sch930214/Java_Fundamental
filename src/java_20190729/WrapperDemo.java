package java_20190729;
//ctrl + shift + o
import java.util.ArrayList;

public class WrapperDemo {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//자바 1.4이전 버전에서는 primitive data type을 Collection에 저장할 수 없었기 때문에 pdt을 객체화 할 수 있는 Wrapper으로 변환하여 저장해야 한다.
		//아래와 같이 1을 add할 수 없음. 1은 integer니까~
		
		//primitive data를 Collection에 담을 수 없음.  Object만 가능. 1을 넣을 수 없으므로 객체화 시켜 클래스로 만들어 넣는다.
		//Character, Integer를 제외한 나머지는 첫글자만 대문자.
		
		
		
		//list.add(1);
		list.add(new Integer(1));
		
		//1. primitive data type => wrapper class(생성자를 이용 => new Integer(10)). collection에 담으려고.
		Integer i2 = new Integer(10);
		Integer i3 = new Integer(20);
				
		
		//2. String => wrapper class(Integer.valueOf(10)) 문자열을  wrapper class로 변환
		String s1 = "10";
		String s2 = "20";
		Integer i1 = Integer.valueOf("s1");
		
		//3. wrapper class => primitive data type으로 변환, 연산하려고.(intValue())
		//불가능.  reference끼리 더하는 것처럼 되므로. 
		//int temp = i2 + i3;
		int temp = i2.intValue() + i3.intValue();
		
		//4. String => primitive data type(Integer.parseInt("10") *************
		//String s1과 s2를 더하려면 primitive data로 바꿔줘야함
		temp = Integer.parseInt(s1) + Integer.parseInt(s2);
		
		//5. Primitive data type => String(String.valueOf() Or +"")
		int a1 = 10;
		String s3 = String.valueOf(a1);
		
		
		//auto-boxing : primitive data type을 자동으로 wrapper로 바꿔줌.
		Integer i4 = 10;
		
		//auto-unboxing : wrapper를 자동으로 primitive data type으로 바꿔줌.
		int a2 = i2 + i3;
		
		System.out.println(i2);
		System.out.println(i2.equals(i3));
		
		String s4 = "12.34";
		//double d1 = Integer.parseInt(s4);
		double d1 = Double.parseDouble(s4);
		System.out.println(d1);
		
		
		
	}
}
