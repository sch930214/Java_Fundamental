package java_20190730;

import java.util.ArrayList;

public class GenericDemo {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		//list.add("4"); Generic으로 Integer인자만 들어가도록 했기 때문에 String 넣을 시 에러.
		
		
		for(int i=0; i<list.size();i++) {
			//Integer temp = (Integer)list.get(i); 들어가는게 확실히 integer이므로 굳이 캐스팅 할 필요 없음.
			Integer temp = list.get(i);																	//꼭 get을 넣어야하는가?
		}	
		System.out.println(list.get(2));
	}
}
