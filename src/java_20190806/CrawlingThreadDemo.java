package java_20190806;

public class CrawlingThreadDemo {
	public static void main(String[] args) {
		
		CrawlingThread c1 = new CrawlingThread("bitcoin","bitcoin.xls");
		
		CrawlingThread c2 = new CrawlingThread("ethereum","ethereum.xls");
		CrawlingThread c3 = new CrawlingThread("ripple","ripple.xls");
		CrawlingThread c4 = new CrawlingThread("bitcoin-cash","bitcoin-cash.xls");
		CrawlingThread c5 = new CrawlingThread("eos","eos.xls");
		CrawlingThread c6 = new CrawlingThread("tron","tron.xls");
		CrawlingThread c7 = new CrawlingThread("neo","neo.xls");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
		c5.start();
		c6.start();
		c7.start();
	}
}
