package java_20190717;

public class SwitchDemo {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		String season = null;
		switch (month) {
		// case�� �򰡰��� �����ؾ� �Ѵ�.
		// ���������� break;��� ��. default�� ���� �߰����� �� ��, �� �ڿ� break; �� �ڿ� ���°� ����.
		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;
		default:
			season = "���� ����";
		}
		
		// printf - pg.36
		// ���ȭ��ǥ - Run configurations - Arguments - Program Arguments�� ��ġ �Է�
		System.out.printf("%d���� %s�Դϴ�.", month, season);
	}
}
