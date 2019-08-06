package java_20190722;

public class MethodDemoo {
	
	void print99danAll() {
		for (int i=1; i<=9;i++) {
			for(int j=2; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + (j*i) + " ");
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		MethodDemoo m = new MethodDemoo();
		m.print99danAll();
	}
}

