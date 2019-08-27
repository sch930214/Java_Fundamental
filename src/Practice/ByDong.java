package Practice;

public class ByDong {									
	public static void main(String[] args) {								
		Developerq d = new Developerq("가나다", 1);							
		System.out.printf("%s의 경력은 %d년으로 %s개발자이며, 연봉은 %d이다.\n", d.getName(), d.getCareer(), d.level(), d.salary());							
		Developerq d1 = new Developerq("라마바", 20);
		System.out.printf("%s의 경력은 %d년으로 %s개발자이며, 연봉은 %d이다.\n", d1.getName(), d1.getCareer(), d1.level(), d1.salary());							
	}								
}									
			
class Developerq {									
	final static int lowLev = 3;								
	final static int middleLev = 7;								
									
	private String name;								
	private int career;								
									
	public Developerq(String name, int career) {								
		this.name = name;							
		this.career = career;							
	}								
									
	public String getName() {								
		return name;							
	}								
									
	public void setName(String name) {								
		this.name = name;							
	}								
									
	public int getCareer() {								
		return career;							
	}								
									
	public void setCareer(int career) {								
		this.career = career;							
	}								
									
	public String level() {								
		String readlev = null;							
		int lev = getCareer();							
									
		if (lev < lowLev) {							
			readlev = "초급";						
		} else if (lev < middleLev) {							
			readlev = "중급";						
		} else {							
			readlev = "고급";						
		}							
		return readlev;							
	}								
									
	public int salary() {								
		int lev = getCareer();							
		int salary = 0;							
									
		if (lev < lowLev) {							
			salary = 2800 + 100 * lev;						
		} else if (lev < middleLev) {							
			salary = 3500 + 100 * lev;						
		} else {							
			salary = 4500 + 100 * lev;						
		}							
		return salary;							
	}								
}				