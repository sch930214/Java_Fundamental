package java_20190725.step3;

import java_20190725.step2.StopWatch;

public class StopWatchDemo {
	public static void main(String[] args) {
		
	
		StopNanoWatch s1 = new StopNanoWatch();

	
		s1.start();

	
	
	
	
	
		for(long i=0;i<30_000_000_000L;i++) {
		
		}
		s1.stop();
	
	
		double elapsedTime = s1.getElapsedTime();
		System.out.printf("경과시간 : %.9f", elapsedTime);

	}
}	
