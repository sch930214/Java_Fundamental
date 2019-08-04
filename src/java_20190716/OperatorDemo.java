package java_20190716;

// Ctrl +Shift + f => 자동을 줄맞취
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10, b = 22;
		int c = 0;
		double d = 0;
		c = a + b;
		System.out.println(c);
	
		d = a - b;
		System.out.println(d);
		
		d = a * b;
		System.out.println(d);
		
		d = (double)b / (double)a;
		System.out.println(d);
		
		c = b % a;
		System.out.println(c);
		
		a = a + b;
		System.out.println(a);
		
		a += b; //a = a + b;
		System.out.println(a);
		
		int sum = 0;
		for(int i=1; i<=3 ; i++) {
			sum +=i;
			System.out.println(sum);
		}
				
		a++;
		b++;
		
		c= a++;
		
		System.out.println(c);
		//대입 후 증가
		
		c = ++b;
		System.out.println(c);
		//증가 후 대입
		
		a = 10;
		b = 20;
		
		boolean isSuccess = false;
		
		isSuccess = a > b;
		
		System.out.println(isSuccess);
		
		isSuccess = a < b;
		
		System.out.println(isSuccess);
		
		isSuccess = a >= b;
		System.out.println(isSuccess);
		
		isSuccess = (a==b) && (a++ == b++);
		System.out.println(isSuccess);
		// a && b => a가 false이면 b연산을 하지않음(short circuit)거짓잉께
		// a || b => a가 true이면 b연상을 하지않음(short circuit) 참이니께
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
