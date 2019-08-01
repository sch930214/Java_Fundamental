package bonus;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Utility {
	//pattern => "yyyy년-MM월-dd일 a hh:mm:ss E요일"
	public static String getXXX(Calendar c, String pattern) {
		return new SimpleDateFormat(pattern).format(c.getTime());
	}
	//Utility.getXXX(c,"yyyy");
	public static boolean mkdirs(String path) {
		boolean isSuccess = false;
		File file = new File(path);
		boolean isExisted = file.isDirectory();
		if(!isExisted) {
			isSuccess = file.mkdirs();
		}
		return isSuccess;
	}
	
	public String getComma(long name) {
		return String.format("%,d", name);     
	}
	
	public String getComma(double name,int precision) {
		return String.format("%,."+precision+"f", name);         
	}
	
	public boolean changeFile(String path) {
		boolean isSuccess = false;
		File oldFile = new File(path);
		String fileName = oldFile.getName();
		String name = fileName.substring(0,fileName.lastIndexOf("."));
		String extensionWithDot = fileName.substring(fileName.lastIndexOf("."));
		//마음에 안들면 아래 부분을 수정하세요..
		name = String.valueOf(System.currentTimeMillis());
		fileName = name+extensionWithDot;
		
		String parent = oldFile.getParent();
		File newFile = new File(parent, fileName);
		isSuccess = oldFile.renameTo(newFile);
		
		return isSuccess;
	}
}

