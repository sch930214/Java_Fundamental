package java_20190731;

import java.util.Calendar;

//one line comment
/*
 multi line comment
 sdf
 
 sdfsdf
 
 sdf
 */
//java docs comment - 문서화했을때 맨처음에 기재됨.
/** 
 Calendar 클래스는 년도별, 월별, 요일을 구할 수 있는 클래스입니다.
 */
public class Calendar2 {
	
	public void print(int year) {
		
		for (int i = 0; i<12; i++) {
			
				print(year,i+1);            
			
			
		}
	}
	/**
	 매개변수에 년도와 월로 호출하면 해당 년도의 월 달력을 출력하는 기능입니다.
	 */
	public void print(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, 1);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//들여쓰기 기능
		//2019 7 1 => 총 날짜를 구한다.
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		for(int i=0; i<dayOfWeek-1; i++) { //우리가 생각하는거랑 달라서 하나 적게. or int i=1;
			System.out.print("\t");
		}
		for( int i = 1; i <= c.getActualMaximum(Calendar.DATE); i++) {
			System.out.print(i+"\t");
			if(dayOfWeek%7 == 0) {
				System.out.println();
			}
			dayOfWeek++;	
		}
		
		System.out.println();
	}
	/**
	 매개변수에 년, 월, 일로 호출하면 해당 날짜의 요일을 출력하는 기능입니다.
	 */
	public void print(int year, int month, int day) {
		Calendar c = Calendar.getInstance();
		c.set(year, month-1, day);
		
		
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		String message = null;
		if (dayOfWeek == Calendar.MONDAY) {
			message = "월요일";
		}
		if (dayOfWeek == Calendar.TUESDAY) {
			message = "화요일";
		}
		if (dayOfWeek == Calendar.WEDNESDAY) {
			message = "수요일";
		}
		if (dayOfWeek == Calendar.THURSDAY) {
			message = "목요일";
		}
		if (dayOfWeek == Calendar.FRIDAY) {
			message = "금요일";
		}
		if (dayOfWeek == Calendar.SATURDAY) {
			message = "토요일";
		}
		if (dayOfWeek == Calendar.SUNDAY) {
			message = "일요일";

		}

		System.out.println(year + "년 " + month + "월 " + day + "일 " + message);
	}
}
