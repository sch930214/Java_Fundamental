package java_20190809;

class A extends Thread{
	public void run() {
		System.out.println("Thread ....");
	}
}


class B implements Runnable{

	public void run() {
		System.out.println("Thread 2 .....");
	}
	
}

public class GarbageDemo {
	public static void main(String[] args) {
		A a = new A();
		a.start();
		System.out.println("aaaaaaaaaaa");
		
		B b = new B();
		Thread t1 = new Thread(b);
		t1.start();
	}
}
