package java_20190723;

public class Calendar {
	public static final int SUNDAY = 0;
	public static final int MONDAY = 1;
	public static final int TUESDAY = 2;
	public static final int WEDNESDAY = 3;
	public static final int THURSDAY = 4;
	public static final int FRIDAY = 5;
	public static final int SATURDAY = 6; // final 변수는 대문자가 관례

	
	
	private int getCount(int year, int month, int day) {
		int preYear = year - 1;
		int preMonth = month - 1;
		int totalCount = 0;


		totalCount = preYear * 365 + (preYear / 4 - preYear / 100 + preYear / 400);

		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (isLeafYear(year)) {           //중복되는 코드 drag > Refactor > Extract Method > 메서드 Name정하고 확인
			monthArray[1] = 29;
		}
	
		for (int i = 0; i < preMonth; i++) {
			totalCount += monthArray[i];
		}

		totalCount += day;
		return totalCount;
	}

	private boolean isLeafYear(int year) {                              //중복된 메서드 따로 빼줌
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}
	
	public int getLastDay(int year, int month) {
		int[] monthArray = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		

		if (isLeafYear(year)) {
			monthArray[1] = 29;
		}
	
		return monthArray[month-1];

	}
//	public void print(int year) {
//		for (int i = 0; i<12; i++) {
//			print(year,i+1);                  //보통 java개발자 사용
//		}
//	}

//	public void print(int year) {
//		for (int i = 1; i<=12; i++) {
//			print(year,i);                    //초보자 보기 쉽게 코딩
//		}
//	}

	public void print(int year) {
		for (int i = 0; i<12; i++) {
			if(i%2 == 1) {
				print(year,i+1);             //홀수달만 출력
			}
			
		}
	}
	
	public void print(int year, int month) {
		
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		//들여쓰기 기능
		//2019 7 1 => 총 날짜를 구한다.
		int totalCount = getCount(year, month, 1); //7로 나누면 1일 거다.
		int rest = totalCount % 7;
		for(int i=0; i<rest; i++) {
			System.out.print("\t");
		}
		for( int i = 1; i <= getLastDay(year, month); i++) {
			System.out.print(i+"\t");
			if(rest%7 == Calendar.SATURDAY) {
				System.out.println();
			}
			rest++;	
		}
		
		System.out.println();
	}

	public void print(int year, int month, int day) {

		int totalCount = getCount(year, month, day);
	
		int dayOfWeek = totalCount % 7;
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
