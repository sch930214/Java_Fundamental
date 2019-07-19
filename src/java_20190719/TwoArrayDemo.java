package java_20190719;

public class TwoArrayDemo {
	public static void main(String[] args) {
		int[][] a = new int[3][2];
		a[0][0] = 10;
		a[0][1] = 20;

		a[1][0] = 30;
		a[1][1] = 40;

		a[2][0] = 50;
		a[2][1] = 60;
		
		int[][] b = {{10,20},{30,40},{50,60}};
		
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {             //for(int j=0; j<a[0].length;j++) { 도 가능. 어차피 정적이라 고정되므로
				System.out.print(a[i][j]+"\t");           //\t 탭 넣어서 띄움
			}	
			System.out.println(); //줄 나눔
		}
		
		int[] c = {10,20,30};
		
		//기본 배열 방식
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		
		//enhanced for loop, 간편~
		
		for(int temp : c) {
			System.out.print(temp+"\t");
		}
		
	}
}
