package java_20190719;

public class ArrayCopyDemo {
	public static void main(String[] args) {
		String[] fruits = {"apple", "banana", "watermelon", "blueberry"};
		
		String[] temp = new String[6];  //���ڿ� String ���� int 
		
		//fruits => �����迭
		//0 => �����迭�� ��ġ ��, �����迭 ���� ���� ��ġ
		//temp => fruits�� �����Ͽ� ���� �迭
		//0 => ī���� �迭�� ���� ��ġ
		//4 => �����迭�� 4����Ҹ� ī��
		System.arraycopy(fruits, 0, temp, 2, 4);
		temp[0] = "peach";
		temp[1] = "raspberry";	
		
		for(String str : temp) {
			System.out.println(str);
		}
	}
}
