package java_20190718;

public class ArrayDemo {
	public static void main(String[] args) {
		//int 배열 선언
		
		int[] a = new int[4];
		
		//int 배열 할당
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		
		//int 배열 출력
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			int temp = a[i];
			sum += temp;
			System.out.println(temp);
			
			
		}
		System.out.printf("배열의 총합은 %d 입니다.%n", sum);
		
		
		//배열 생성과 할당이 동시에 이루어짐
		int[] b = {1000, 2000, 3000, 4000};
		
		//이런 식으로 배열 안의 수치 별개로 변경 가능(재할당) - 배열의 값 변경(할당)
		b[0] = 1;
		b[1] = 2;
		
		//배열의 출력(단순방식)
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
		System.out.println(b[3]);
		
		//for loop를 활용한 배열의 출력
		for(int i=0; i<b.length; i++) {       //for ctrl+space하면 코드내용 싹 나옴.
			System.out.println(b[i]);
		}
	}

}
