package java_20190716;

public class SsnDemo {
	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 1;
		int a3 = 1;
		int a4 = 1;
		int a5 = 1;
		int a6 = 1;
		
		int b1 = 1;
		int b2 = 1;
		int b3 = 1;
		int b4 = 1;
		int b5 = 1;
		int b6 = 1;
		int b7 = 8;
		// 1. �� �ڸ����� 2���� 9���� ���ϰ� �ٽ� 2~5���� ���ؼ� ���� ����
		
		int sum = a1*2 + a2*3 + a3*4 + a4*5+ a5*6 + a6*7+  
				b1*8+ b2*9 + b3*2 + b4*3+ b5*4+ b6*5;
		
		// 2. ������ 11�� ���� �������� ���ϴ�.
		int rest = sum % 11;
		// 3. 11���� �������� ����
		rest = 11 - rest;
		// 4. 3�� ����� 10�� ���� �������� ���Ѵ�
		rest %= 10;
		// 5. 4�� ����� ������ ���ڰ� ������ �������� �ֹι�ȣ
		if(rest == b7) {
			System.out.println("�������� �ֹι�ȣ");
		}else {
			System.out.println("���������� �ֹι�ȣ");
			

		}
	}
}
		
		
		