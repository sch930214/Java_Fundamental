package java_20190718;

public class CalenderDemo {
	public static void main(String[] arge) {
		
		/*
		
		// -�޷¸����
		
		1. 1�� 1��1�� ������
		2. 1�� 365�� �̰�, �����϶����� 366�� - 2��29��
		3. ������ 4�⸶�� �߻��ϰ� ���� 100�Ǽ��� �����ϰ� 400�� ����� �������� �ʴ´�.
		4. 2019�� 12�� 25�� ���������ϱ�?
		5. 2018������� ���ϼ�, 11������ ���ϼ�, 25���� ���ؼ� 7�γ��� �������� 1�̸� ������, 2�̸� ȭ����
		*/
		
		
		int year = 2020;
		int month = 2;
		int day = 14;
		
		int preYear = year-1;
		int preMonth = month -1;
		int totalCount = 0;
		
		//2018�⵵������ ���ϼ��� ���϶�!
		
		totalCount = preYear * 365 +(preYear/4 - preYear/100 + preYear/400);
		
		int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//boolean isLeafYear = year%4==0 && (year%100 != 0 || year%400 == 0);
		//if(isLeafYear) {
			//monthArray[1] = 29;
		//}
		
		if(year%4==0 && (year%100 != 0 || year%400 == 0)) {
			monthArray[1] = 29;
		}
		/*}else {//�ٲܰ� �����ϱ� �����
			
		}
		*/
		//2019�⵵ 11������ �� ���ϱ�
		for(int i=0; i<preMonth; i++) {
			totalCount += monthArray[i];
		}
		
		
		totalCount += day;
		
		int dayOfWeek = totalCount % 7;
		String message = null;
		if(dayOfWeek == 1) {
			message = "������";
		}if (dayOfWeek == 2) {
			message = "ȭ����";
		}if (dayOfWeek == 3) {
			message = "������";
		}if (dayOfWeek == 4) {
			message = "�����";
		}if (dayOfWeek == 5) {
			message = "�ݿ���";
		}if (dayOfWeek == 6) {
			message = "�����";
		}if (dayOfWeek == 0) {
			message = "�Ͽ���";
					
		}
		
		System.out.println(year+"�� "+ month + "�� "+ day + "�� "+ message);
		
		
		
	}
}