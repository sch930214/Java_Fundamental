package Practice;

public class Main {
	int i;
	int j;
	
	public Main(int i , int j ) {
		this.i = i;
		this.j = j;
	}
	public Main(int i) {
		this.i = i;
	}
	public Main() {
		
	}
	
	 void run() {
		System.out.println("소모 칼로리: %.1f kcal %n");
	}

	public static void main(String[] args) {
				Main m = new Main(2,3);
				Main m1 = new Main();
				
				System.out.println(m.i);
				System.out.println(m.j);
				
				System.out.println(m1.i);
				System.out.println(m1.j);
			    double x = 0.02;
			    double y = 5000;
			    new Main().run();

	  
	}
}