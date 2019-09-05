package Practice;

public class MeaningFullName {
	public static void main(String[] args) {
<<<<<<< HEAD
=======
		
	Developer a = new Developer("정훈",2);	
	Developer b = new Developer("원석",5);	
	Developer c = new Developer("동혁",9);
	
	
	
	int beginnerSal = 2800;
	int intermediateSal = 3500;
	int advancedSal = 4500;
>>>>>>> branch 'master' of https://github.com/sch930214/Java_Fundamental.git
	
<<<<<<< HEAD
	Developer a = new Developer("정훈",2);
	Developer b = new Developer("원석",5);
	Developer c = new Developer("동혁",9);
		
	
	
//	a.grade(a.career);
//	System.out.println(a.salary(a.grade(a.career), a.career));
=======
	
>>>>>>> branch 'master' of https://github.com/sch930214/Java_Fundamental.git
	//"이름"의 경력은 "몇"년으로 "등급"개발자이며, 연봉은 "얼마"이다.
	
	a.result(new Developer("정훈",2));
	b.result(new Developer("원석",5));
	c.result(new Developer("동혁",9));
//	b.result();
//	c.result();
	
	}
}

class Developer {
	String name;
	int career;
	int beginnerSal = 2800;
	int intermediateSal = 3500;
	
	int advancedSal = 4500;
	

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(String name, int career) {
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

	public int getBeginnerSal() {
		return beginnerSal;
	}

	public void setBeginnerSal(int beginnerSal) {
		this.beginnerSal = beginnerSal;
	}

	public int getIntermediateSal() {
		return intermediateSal;
	}

	public void setIntermediateSal(int intermediateSal) {
		this.intermediateSal = intermediateSal;
	}

	public int getAdvancedSal() {
		return advancedSal;
	}

	public void setAdvancedSal(int advancedSal) {
		this.advancedSal = advancedSal;
	}

	public String grade(int a) {
		String b = null;
		if (a < 3) {
			b = "초급";
		} else if (a >= 3 && a < 7) {
			b = "중급";
		} else if (a >= 7) {
			b = "고급";
		}
		return b;

	}
	
	public int salary(String x, int y) {
		int temp = 0;
		if (x == "초급") {
			temp = beginnerSal + 100*y;
		}else if (x == "중급") {
			temp = intermediateSal + 100*y;
		}else if (x == "고급") {
			temp = advancedSal + 100*y;
		}
		return temp;
	}
	
	public void result(Developer d) {
		System.out.printf("%s의 경력은 %d년으로 %s개발자이며, 연봉은 %d이다.%n",d.name,d.career,d.grade(d.career),d.salary(d.grade(d.career), d.career));
	}
}

	
//	개발자(Developer)는 이름과 경력(년차) 정보를 갖는다.
//	개발자는 경력에 따라 초급(3년 미만)/중급(7년 미만)/고급(7년이상)의 단계로 나뉜다.
//	연봉은 아래의 공식을 따른다 
//	연봉 = 단계별 기준연봉 + (100 * 경력)
//	단계별 기준연봉은 초급(2800) / 중급(3500) / 고급(4500) 으로 함.