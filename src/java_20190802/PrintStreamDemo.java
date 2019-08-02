package java_20190802;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			
			
			
			
			
			fis = new FileInputStream("c:\\dev\\test\\java_pdf.zip");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\dev\\test\\java_pdf_clone.zip");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos,true);
			
			
			int readByte = 0;
			while((readByte = fis.read()) != -1) {
				ps.write(readByte); //byte단위는 write. 
			}
			
			//bos.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fis != null) fis.close();
				if(bis != null) bis.close();
				if(fos != null) fos.close();
				if(bos != null) bos.close();
				if(ps != null) ps.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}	
}
