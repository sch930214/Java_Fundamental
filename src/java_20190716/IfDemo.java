package java_20190716;

public class IfDemo {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		System.out.println(month);
		// run configurations => Arguments => program arguments
		String season = null;
		if (month == 12 || month == 1 || month == 2) {
			season = "�ܿ�";
		} else if (month == 3 || month == 4 || month == 5) {
			season = "��";
		} else if (month == 6 || month == 7 || month == 8) {
			season = "����";
		} else if (month == 9 || month == 10 || month == 11) {
			season = "����";
		} else {
			season = "���� ����";
		}
		System.out.println(month + "���� " + season + "�Դϴ�.");

	}
}
