package java_20190718;

public class ArrayDemo {
	public static void main(String[] args) {
		//int �迭 ����
		
		int[] a = new int[4];
		
		//int �迭 �Ҵ�
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		//int �迭 ���
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			int temp = a[i];
			sum += temp;
			System.out.println(temp);
			
			
		}
		System.out.printf("�迭�� ������ %d �Դϴ�.%n", sum);
		
		
		//�迭 ������ �Ҵ��� ���ÿ� �̷����
		int[] b = {1000, 2000, 3000, 4000};
		
		//�̷� ������ �迭 ���� ��ġ ������ ���� ����(���Ҵ�) - �迭�� �� ����(�Ҵ�)
		b[0] = 1;
		b[1] = 2;
		
		//�迭�� ���(�ܼ����)
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		
		//for loop�� Ȱ���� �迭�� ���
		for(int i=0; i<b.length; i++) {       //for ctrl+space�ϸ� �ڵ峻�� �� ����.
			System.out.println(b[i]);
		}
	}

}
