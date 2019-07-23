package java_20190723;

public class VarArgDemo {
	//public VarArgDemo() {}    <= default constructor를 compiler가 자동으로 생성
	public long sum(int... temp) {     //+,*의 반환값은  long으로 잡는 것이 좋다. temp변수는 배열로 처리함.
		long sum = 0; //지역변수, 메서드 내에서 유효함, 초기값을 설정(초기화)해주는 것이 좋다.
		
		for(int t : temp) {
			sum += t;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		VarArgDemo v1 = new VarArgDemo();
		
		long s1 = v1.sum(1,2);
		System.out.println(s1);
		long s2 = v1.sum(1,2,3,4);
		System.out.println(s2);
		
	}
}
