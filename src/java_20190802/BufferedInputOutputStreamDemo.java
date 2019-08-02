package java_20190802;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			
			//1. FileInputStream,FileOutputStream을 이용하여 1바이트 읽어서 1바이트 출력한 예제 / 시간 10초
//			fis = new FileInputStream("c:\\dev\\test\\java_pdf.zip");
//			fos = new FileOutputStream("c:\\dev\\test\\java_pdf_copy.zip");
//			int readByte = 0;
//			long start = System.currentTimeMillis();
//			while((readByte = fis.read()) != -1) {
//				fos.write(readByte);
//			}
//			long end = System.currentTimeMillis();
//			System.out.printf("경과시간 : "+(end-start));
			
			
			//2. BufferedInputStream,BufferedOutputStream을 이용하여 1바이트 읽어서 1바이트 출력한 예제 / 시간 0.083초
			//	 BufferedInputStream의 read() 메서드는 1바이트 읽어서 BufferedInputStream의 버퍼(byte[])공간에 저장한다.
			//	 BufferedOutputStream의 write() 메서드는 1바이트 출력하는 것이 아니라 BufferedOutputStream의 버퍼(byte[])
			//	  공간에 가득 차 있으면 출력한다. (Buffered는 8192Byte) 만약 다 채워지지 않으면 출력하지 않는다. 이런경우 flush() 메서드 이용하여 출력.
//			fis = new FileInputStream("c:\\dev\\test\\java_pdf.zip");
//			fos = new FileOutputStream("c:\\dev\\test\\java_pdf_copy.zip");
//			bis = new BufferedInputStream(fis);//stream chaining
//			bos = new BufferedOutputStream(fos);//stream chaining
//			int readByte = 0;
//			long start = System.currentTimeMillis();
//			while((readByte = bis.read()) != -1) { 
//				bos.write(readByte);
//			}
//			//BufferedOutStream의 버퍼(byte[])는 다 채워지면 자동으로 전송하지만 다 채워지지 않으면 전송하지 않는다.
//			//따라서 다 채워지지 않더라도 버퍼를 비우기 위해서는 flush() 메서드를 사용해야 한다.+
//			bos.flush();// 꼭 해야한다.
//			long end = System.currentTimeMillis();
//			System.out.printf("경과시간 : "+(end-start));
			
			
			
			//3. FileInputStream,FileOutputStream을 이용하여 8192바이트 읽어서 8192바이트로 출력한 예제 / 시간 0.002초
			fis = new FileInputStream("c:\\dev\\test\\java_pdf.zip");
			fos = new FileOutputStream("c:\\dev\\test\\java_pdf_copy.zip");
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*8];
			long start = System.currentTimeMillis();
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes,0,readByteCount);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : "+(end-start));
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(fos != null) fos.close();
				if(bis != null) bis.close();
				if(bos != null) bos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
