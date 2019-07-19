package java_20190717;

public class ForDemo {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1 ; i<=10; i++) {
			if(i%2 == 0) {
				sum = sum + i; //sum += i;
			}	
		}
		System.out.printf("1부터 10까지 짝수의 총 합은 %d 입니다.%n", sum);	
		
		for(int first = 2; first<=9; first++) {
			for(int second = 1; second<=9; second++) {
				System.out.printf("%d * %d = %d%n", first, second, first*second);
			}
		}
		
		
		
		for(int i = 0; i<5; i++) { 
			for(int j = 0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a = 9; a>=2; a--) {
			for(int b = 1; b<=9; b++) {
				System.out.printf("%d * %d = %d%n", a, b, a*b);
			}
		}
		
	}
}




