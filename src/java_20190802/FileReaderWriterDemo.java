package java_20190802;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterDemo {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("c:\\dev\\test\\kic.txt");
			fw = new FileWriter("c:\\dev\\test\\kic_copy.txt");
			/*
			int readChar = 0;
			while((readChar = fr.read()) != -1) {
				System.out.print((char)readChar);  //모니터에 출력
				fw.write(readChar);					//파일복사출력
			}
			*/
			
			int readCharCount = 0;
			char[] readChars = new char[10];
			while((readCharCount = fr.read(readChars))!= -1) {
				System.out.print(new String(readChars,0,readCharCount)); //모니터에 출력
				fw.write(readChars,0,readCharCount);					//파일복사출력
				//fw.write(new String(readChars,0,readCharCount);		//"파일복사출력" 문자열도 출력가능하므로
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
