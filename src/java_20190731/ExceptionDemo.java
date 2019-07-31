package java_20190731;

import java.util.ArrayList;

public class ExceptionDemo {
	public static void main(String[] args) {
		//NumberFormatException
		int i = Integer.parseInt("1111");
		System.out.println(i);

		//ArrayIndexOutOfBoundsException
		int[] a = {1,2,3,4};
		System.out.println(a[3]);
	
		//list.get(2) => IndexOutOfBoundsException
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		System.out.println(list.get(1));
	
		//NullPointerException
		String str = "abcd";
		System.out.println(str.length());
		
		//분모가 0일 때 => ArithmeticException / b
		
	
		int b = 0;
		int c = 1;
		System.out.println(c/b);
	}
}
