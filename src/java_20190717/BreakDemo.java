package java_20190717;

public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		//for����� label
		test: for(int i = 1 ; i<=10 ; i++) {
			if(i==6) break test; //break�� �ش����� ���ѷ���(�ݺ���)�� ���������� ��. ex.�ݺ���(for��, while��), ����ġ���̽�
								//test��� label�� �ݺ����� ���������ڴ�.
			sum = sum + i;
		}
		System.out.printf("1���� 5���� ¦���� �� ���� %d �Դϴ�.%n", sum);
		
		outter:for(int first = 2; first<=9; first++) {
			for(int second = 1; second<=9; second++) {
				if(first==4 && second==8) break outter;
				//break outter���� outter ����� 4*7���� ������ ���� 5�ܺ��� �ٽ� ���
				System.out.printf("%d * %d = %d%n", first, second, first*second);
				//////////
			}
		}
	}
}
