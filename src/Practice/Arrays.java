package Practice;

public class Arrays {
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5};
		int[] tmp = new int[a.length*2];
		
		for(int i=0;i<a.length;i++) {
			tmp[i] = a[i];
		}
		a = tmp;
		
		System.out.println(a.length);
	}
}
//배열 복사해서 집어넣으면 배열 길이도 확장!