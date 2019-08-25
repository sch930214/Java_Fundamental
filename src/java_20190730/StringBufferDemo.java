package java_20190730;

public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("test");		//StringBuffer란?
		StringBuffer s2 = new StringBuffer("test");
		System.out.println(s1 == s2);
		//equals() overriding 하지 않았기 때문에 false
		System.out.println(s1.equals(s2));				//overriding하지않았따는게 무슨말이여
		
		//StringBuffer => String : toString()
		String s3 = s1.toString();
		String s4 = s2.toString();
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));				//여기선 또 왜 같은거야?
		
		//문자열 뒤에 연결
		StringBuffer sql = new StringBuffer();
		sql.append("select name, age ");				
		sql.append("from member");
		sql.append("where name = '손정훈' " );
		sql.append("order by name desc");
		
		System.out.println(sql);
		
		//sql의 모든 문자열 지우기
		sql.setLength(0);
		System.out.println(sql);
		
		//다시 추가
		sql.append("select no, writer from board");
		System.out.println(sql);
	}
}
