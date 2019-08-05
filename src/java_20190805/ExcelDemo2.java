package java_20190805;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ExcelDemo2 {
	public static void main(String[] args) {
		// 1. c:\dev\test\test1.txt파일 읽어온다. - BufferedReader
		// 2. BufferedReader의 readLine() 메서드를 이용해서 한줄씩 읽어온다.
		// 3. 한 줄 읽은 문자열을 String의 split("#");을 이용해서 String[] 반환받는다.
		// 4. [0] => cell 입력한다. [1] => cell 입력한다.
		// [2] => cell 입력한다. [3] => cell 입력한다.
		// 2.3.4 반복작업을 해서 엑셀에 입력한다.
		// 5. 엑셀파일명 : c:\dev\test\test2.xls 파일로 저장한다.
		FileReader fr = null;
		
		
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fr = new FileReader("c:\\dev\\test\\test1.txt");
			br = new BufferedReader(fr);
			
			String[][] a = new String [4][4];
			
			String readLine = null;
			while((readLine = br.readLine()) != null) {
				bw.write(readLine);
				
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) fr.close();
				if(br != null) br.close();
				if(fw != null) fw.close();
				if(bw != null) bw.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}	

//
//String[] strArray = ssn.split("-");
//System.out.println(strArray[0]);
//System.out.println(strArray[1]);