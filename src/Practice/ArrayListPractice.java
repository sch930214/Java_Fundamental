package Practice;

import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("니하오");
		list.add("6");
		

		Desk d = new Desk();
		d.product = "refrigerator";
		d.ingredient = "fabric";
		d.date = "3년";

		System.out.println();

		int[] a = new int[4];
		a[0] = 6;
		a[1] = 1;
		a[2] = 2;
		a[3] = 4;

		String[] x = new String[3];
		x[0] = "elephant";
		x[1] = "giraffe";
		x[2] = "bear";

		System.out.println(x[0]);

		String h = "horse";

		System.out.println(h);

		System.out.println(a[3]);

		System.out.println(list.get(4));

		System.out.println(list);
	}
}
