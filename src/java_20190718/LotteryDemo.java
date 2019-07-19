package java_20190718;

public class LotteryDemo {
	public static void main(String[] args) {
		
		//Math.random() => 0���� ũ�ų� ���� 1���� ���� ����� double������ ��ȯ�Ѵ�. [0~0.999...]
		//double random = Math.random();
		
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			//temp�� 1���� ũ�ų� ���� 45���� �۰ų� ���� ������ ��
			//�Ź� ���� �����Ǿ�� �Ѵ�.
			double random = Math.random();
			int temp = (int)(random * 45) + 1;
			
			if(i==0 ) {  //ù��° ���� ������ ������ �� temp�� �����Ѵ�.(�񱳴���� �����Ƿ�)
				lotto[i] = temp;
			}else {
				//isExisted�� ������ �� temp�� ���� �迭�� ���� ������ �� ������ ���� �ִ� ���� true, ������ false
				boolean isExisted = false;
				//i==1 �Ʒ��� for loop�� 1�� �ݺ�
				//i==2 �Ʒ��� for loop�� 2�� �ݺ�
				//i==3 �Ʒ��� for loop�� 3�� �ݺ�.....
				for (int j = 0; j<i; j++) {                           //�ڱ� �ε������� ������ ���� �� j<i
					if(lotto[j]==temp) {
						//���� ������ temp�� ���� �迭�� ���� ���ؼ� ���� ���� �����ϸ� 
						isExisted = true;
						break;
					}
					
				}
				if(!isExisted) {
					lotto[i] = temp;
				}else {
					i--; //���� ��ġ�� �����ϸ� for loop���� i++�� �����ϱ� ������ �� ��ġ�� �ٽ� �õ��� �� ����.
				}
			}
			
			lotto[i] = temp;
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + ", ");
		}
		
		//�������� - �ΰ��� ���ؼ� �� ũ�� ������
		
	}
}
