package java_20190719;

public class Pracitce_20190719 {
	public static void main(String[] args) {
		FamilyMember f1 = new FamilyMember();
		f1.name = "Son Cheong Hun";
		f1.status = "Student";
		f1.age = 27;
		
		f1.getInfo();
		
		FamilyMember f2 = new FamilyMember();
		f2.name = "Son Il Dong";
		f2.status = "Father + CEO";
		f2.age = 65;
		
		f2.getInfo();
		
//		FamilyMember f3 = new FamilyMember();
//		f3.setInfo("Kim Kyung Ae", "Mother", 63);
//		f3.getInfo();
		
		FamilyMember f4 = new FamilyMember();
		f4.getInfo("Son Gee Yeon", "BigSister", 34);
	}
}
