package Practice;

public class MeaningFullName {
	public static void main(String[] args) {
		
	Developer a = new Developer("정훈",2);	
	Developer b = new Developer("원석",5);	
	Developer c = new Developer("동혁",9);	
		
	int beginnerSal = 2800;
	int intermediateSal = 3500;
	int advancedSal = 4500;
	
	a.grade(a.career);
	//"이름"의 경력은 "몇"년으로 "등급"개발자이며, 연봉은 "얼마"이다.
	}
}

class Developer {
	String name;
	int career;

	public Developer(String name, int career) {
		this.name = name;
		this.career = career;
	}

	public void grade(int a) {
		if (a < 3) {
			System.out.println("초급");
		} else if (a >= 3 && a < 7) {
			System.out.println("중급");
		} else if (a > 7) {
			System.out.println("고급");
		}

	}
}

//	
//	개발자(Developer)는 이름과 경력(년차) 정보를 갖는다.
//	개발자는 경력에 따라 초급(3년 미만)/중급(7년 미만)/고급(7년이상)의 단계로 나뉜다.
//	연봉은 아래의 공식을 따른다 
//	연봉 = 단계별 기준연봉 + (100 * 경력)
//	단계별 기준연봉은 초급(2800) / 중급(3500) / 고급(4500) 으로 함.