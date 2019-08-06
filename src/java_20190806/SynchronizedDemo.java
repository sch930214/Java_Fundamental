package java_20190806;

public class SynchronizedDemo implements Runnable{
	int x;
	int y;
	
	@Override
	public synchronized void run() {  //두 스레드가 같은 객체를 가리킬 때 synchronized 하면 먼저 수행된 스레드가 끝날때까지 기다렸다가 다른 스레드 시작.
	//public void run() {      
		// TODO Auto-generated method stub
		//synchronized (this) {
		//synchronized (SynchronizedDemo) --------------------------선생님파일 보고 바꿩.
		
			for(int i = 0; i<100; i++) {
				x++;
				y++;
				String threadName = Thread.currentThread().getName();
				System.out.printf("x : %d, y : %d - %s%n",x,y,threadName);
			}
		//}
	}
	
	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo(); 
		//객체 2개로 만들면  synchronized 안먹힘.
		//SynchronizedDemo s2 = new SynchronizedDemo(); 
	
		
		Thread t1 = new Thread(s1);
		Thread t2 = new Thread(s1);
		//Thread t2 = new Thread(s2);
		
		t1.start();
		t2.start();
		
	}
	
}
