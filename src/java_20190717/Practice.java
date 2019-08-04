package java_20190717;

public class Practice {
	public static void main(String[] args) {
		int sum = 0;
		
		 for (int i = 0; i <= 10; i++) {
			if (i == 6) 	break ;

			sum += i;
		}
		System.out.printf("%d", sum);
	}
}
