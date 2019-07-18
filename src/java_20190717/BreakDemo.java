package java_20190717;

public class BreakDemo {
	public static void main(String[] args) {
		int sum = 0;
		//for블록의 label
		test: for(int i = 1 ; i<=10 ; i++) {
			if(i==6) break test; //break는 해당블록의 무한루프(반복문)를 빠져나가는 것. ex.반복문(for문, while문), 스위치케이스
								//test라는 label의 반복문을 빠져나가겠다.
			sum = sum + i;
		}
		System.out.printf("1부터 5까지 짝수의 총 합은 %d 입니다.%n", sum);
		
		outter:for(int first = 2; first<=9; first++) {
			for(int second = 1; second<=9; second++) {
				if(first==4 && second==8) break outter;
				//break outter에서 outter 지울시 4*7까지 나오고 이후 5단부터 다시 출력
				System.out.printf("%d * %d = %d%n", first, second, first*second);
				//////////
			}
		}
	}
}
