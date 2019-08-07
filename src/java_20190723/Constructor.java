package java_20190723;

public class Constructor {
	int a;
	int b;
	int d;
	
	public Constructor(int d) {
		this.d = d;
	}
	
	
	
	public Constructor(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	public void sum() {
		System.out.println(a+b+d);
	}
	
	public void avg() {
		System.out.println((a+b)/2);
	}
	
	
	public static void main(String[] args) {
		Constructor p1 = new Constructor(30);
		p1.sum();
		Constructor p2 = new Constructor(50,60);
		p2.avg();
	}
}
