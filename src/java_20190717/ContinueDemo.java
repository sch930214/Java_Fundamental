package java_20190717;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		//for����� label
		for(int i = 1 ; i<=10 ; i++) {
			//if(i==6) return; ���⿡ ������ �ƿ� ó��(main)���� ���ư�. �׷��� �ƹ��͵� ��� �ȵ�.
			
			if(i==6) continue; //continue�� ����ϰ� �Ǹ� 6�� ������ ���ڸ� ����. 
								//continue�� ������ �� ������ ������ �������� �ʰ� ���ǹ����� �ǵ��ư��� ��� �����ϴ� ��.
			sum = sum + i;
		}
		System.out.printf("1���� 10���� �� ���� %d �Դϴ�.%n", sum);
		
		if(true) return; //return ���� ���� ����ȵ�. ���⿡ ��ġ�ϸ� �ؿ� ���� ��� �ȵ�.
		
		outter:for(int first = 2; first<=9; first++) {
			for(int second = 1; second<=9; second++) {
				if(second==5) continue outter;
				//continue outter label�� �޾Ƴ��� ������ ù��° for�� �������� ���ư��� second�� 5�̻��� �������� ���δ� ����
				//continue �ڿ� label�� ������ �ι�° for�� �������� ���ư��� ���ڸ��� 5�� �����ܸ� ���� ����
				System.out.printf("%d * %d = %d%n", first, second, first*second);
				
			}
		}
	}
}