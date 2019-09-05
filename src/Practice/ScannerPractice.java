package Practice;
import java.util.*;
public class ScannerPractice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("2자리 정수를 하나 입력 바람");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력내용 : " + input);
		System.out.printf("num=%d%n", num);
		
	}
}
