package java_20190716;

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
		int month = 3;
		int day = 15;
		
		int preYear = year-1;
		int preMonth = month -1;
		int totalCount = 0;
		
		//2018�⵵������ ���ϼ��� ���϶�!
		
		totalCount = preYear * 365 +(preYear/4 - preYear/100 + preYear/400);
		
		totalCount += 31 - 29;
		
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