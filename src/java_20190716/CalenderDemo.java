package java_20190716;

public class CalenderDemo {
	public static void main(String[] arge) {
		
		/*
		
		// -달력만들기
		
		1. 1년 1월1일 월요일
		2. 1년 365일 이고, 윤년일때에는 366일 - 2월29일
		3. 윤년은 4년마다 발생하고 그중 100의수는 제외하고 400의 배수는 제외하지 않는다.
		4. 2019년 12월 25일 무슨요일일까?
		5. 2018년까지의 총일수, 11월까지 총일수, 25일을 더해서 7로나눈 나머지가 1이면 월요일, 2이면 화요일
		*/
		
		
		int year = 2019;
		int month = 7;
		int day = 23;
		
		int preYear = year-1;
		int preMonth = month -1;
		int totalCount = 0;
		
		//2018년도까지의 총일수를 구하라!
		
		totalCount = preYear * 365 +(preYear/4 - preYear/100 + preYear/400);
	
		totalCount += 31 + 28 + 31 + 30 + 31 + 31;
	
		totalCount += day;
		
		int dayOfWeek = totalCount % 7;
		String message = null;
		if(dayOfWeek == 1) {
			message = "월요일";
		}if (dayOfWeek == 2) {
			message = "화요일";
		}if (dayOfWeek == 3) {
			message = "수요일";
		}if (dayOfWeek == 4) {
			message = "목요일";
		}if (dayOfWeek == 5) {
			message = "금요일";
		}if (dayOfWeek == 6) {
			message = "토요일";
		}if (dayOfWeek == 0) {
			message = "일요일";
					
		}
		
		System.out.println(year+"년 "+ month + "월 "+ day + "일 "+ message);
		
		
		
	}
}