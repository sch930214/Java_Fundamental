package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {
	public static void main(String[] args) {
		
	ArrayList al = new ArrayList() ;
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	al.add(6);
	
	Iterator it1 = al.iterator();
	
	while(it1.hasNext()) {
		//System.out.println(it1.next()); 	//값 출력
		if(it1.next() == "3") {
			break;
		}
	}
	
	
	}
}
