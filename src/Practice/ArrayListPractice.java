package Practice;

import java.util.ArrayList;

public class ArrayListPractice {
	public static void main(String[] args) {
		ArrayList man = new ArrayList();
		man.add(1);
		man.add("field");
		man.add(2);
		man.add(3);
		man.remove(1);
		man.add(1,1.5);
		
		
		System.out.println(man.get(0));
		System.out.println(man.get(1));
		
		
	}
}
