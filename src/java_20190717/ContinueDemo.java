package java_20190717;

public class ContinueDemo {
	public static void main(String[] args) {
		int sum = 0;
		//for블록의 label
		for(int i = 1 ; i<=10 ; i++) {
			//if(i==6) return; 여기에 적으면 아예 처음(main)으로 돌아감. 그래서 아무것도 출력 안됨.
			
			if(i==6) continue; //continue를 사용하게 되면 6을 제외한 숫자를 더함. 
								//continue를 만나면 그 이하의 문장은 수행하지 않고 조건문으로 되돌아가서 계속 수행하는 것.
			sum = sum + i;
		}
		System.out.printf("1부터 10까지 총 합은 %d 입니다.%n", sum);
		
		if(true) return; //return 이후 내용 실행안됨. 여기에 위치하면 밑에 내용 출력 안됨.
		
		outter:for(int first = 2; first<=9; first++) {
			for(int second = 1; second<=9; second++) {
				if(second==5) continue outter;
				//continue outter label을 달아놨기 때문에 첫번째 for문 조건으로 돌아가서 second가 5이상인 구구단은 전부다 빠짐
				//continue 뒤에 label이 없을시 두번째 for문 조건으로 돌아가서 뒷자리가 5인 구구단만 전부 빠짐
				System.out.printf("%d * %d = %d%n", first, second, first*second);
				
			}
		}
	}
}