package java_20190723;

public class PrimeNumber {
	public void printPrimeNumber(int temp) {
		//temp => 50이면 50이하의 소수를 모두 구하여 출력한다.
		
		boolean isPrimeNumber = false;
		int count = 0;
		for (int i=2; i <= temp; i++) {
			isPrimeNumber = true;
			for (int n = 2; n< i; n++) {
				if (i % n == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				count++;
				System.out.print(i+"\t");
			}
		}
		
			
		System.out.println();
		System.out.printf("소수의 갯수 : %s%n",count);
		
		
		
		
	}
}
