package Practice;

import java.util.ArrayList;

public class ArrayConstructor {
	String status;
	int age;
	String name;
	ArrayConstructor(String name, String status, int age) {
		this.name = name;
		this.status = status;
		this.age = age;
	}	
	
	public String toString() {
		return "이름 : "+name + "\t신분: " +status + "\t나이 : "+age;
	}

	
	public static void main(String[] args) {
		ArrayList list;
		list = new ArrayList() ;
		ArrayConstructor ac1 = new ArrayConstructor("동혁","친구",27);
		ArrayConstructor ac2 = new ArrayConstructor("원석","동생",25);
		ArrayConstructor ac3 = new ArrayConstructor("정훈","나",27);
		
		list.add(ac1);
		list.add(ac2);
		list.add(ac3);
		
		System.out.println((ac1.name));
		//System.out.println("이름 : "+ac1.name+  "\t신분 : "+ ac1.status + "\t나이 : "+ac1.age);
		
		System.out.println(ac1.toString());
		System.out.println(ac1);                      //toString()자동으로 호출
		System.out.println(ac2);
		
	}
	
}	

