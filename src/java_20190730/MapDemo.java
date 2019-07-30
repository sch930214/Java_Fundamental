package java_20190730;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		
		//HashMap key값은 유일해야하고, value에는 객체를 저장(인티저,클래스등 전부가능)하는데 중복허용
		HashMap<String,Integer> map = new HashMap<String,Integer>(); // 생성
	
		//할당
		map.put("1", 111111);
		map.put("2", 222222);
		map.put("3", 333333);
		map.put("4", 444444);
		map.put("5", 555555);
		map.put("1", 666666);// 키 값이 중복되면 마지막에 설정한 값이 나옴.
	
		//1개 출력
		Integer value = map.get("1");     
		System.out.println(value);
		
		
		//모두 출력
							//keySet => key값을 Set으로 바꿔달라. key값을 전부 가져와서 Set이란 곳에 뒤죽박죽으로 넣어놓음.
		Set<String> set = map.keySet();
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			String k = i.next();
			Integer v = map.get(k);
			System.out.printf("key : %s, value : %d%n", k,v);
		}
		
	}
}
