package java_20190715;

public class LiteralDemo {
	public static void main(String[] args) {
		//byte ������ �Ѿ�� ������ �����߻�
		//byte a1 = (byte)128;
		int a1 = 128;//10���� ǥ���
		int a2 = 076;//8���� ǥ���
		int a3 = 0x123;//16���� ǥ���
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		//long ���ͷ��� ���� �ڿ� l, L�� ǥ����.
		long a4 = 1L;
		
		//float ���ͷ��� �Ҽ��� �ڿ� f, F�� ǥ��
		float f1 = 1234.43f;
		//double ���ͷ��� �Ҽ��� �ڿ� d, D�� ǥ�� Ȥ�� ��������
		double d1 = 123455.56d;
		
		//boolean ���ͷ���  true, false
		boolean isExisted = false;
		
		a1 = 10;
		d1 = 10.0d;
		//primitive data type�� == �����ڴ� ���� ����.
		System.out.println(a1==d1);
		
		int b1 = 10;
		//b2dp b1�� ���� 10�� �Ҵ�.
		int b2 = b1;
		b2 = 20;
		System.out.println(b1);
		System.out.println(b2);

	}
}
