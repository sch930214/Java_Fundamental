package Practice;

public class Result {
  public static void main(String[] args) {
	  Medal nor = new Medal(10,9,8);
	  Medal ger = new Medal(9,5,4);
	  Medal net = new Medal(6,5,2);
	  Medal can = new Medal(5,5,6);
	  Medal usa = new Medal(5,3,2);
	  Medal swe = new Medal(4,3,0);
	  Medal aus = new Medal(4,2,4);
	  Medal fra = new Medal(4,2,4);
	  Medal kor = new Medal(3,2,2);
	  Medal jap = new Medal(2,5,3);
	  
	  System.out.println(nor[0]);
	  
	  int count = 0;
	  for(int i = 0; i<20; i++) {
		  
	  }
	  
  }
}

class Medal {
	int gMedal;
	int sMedal;
	int bMedal;
	int medalTotal = gMedal + sMedal + bMedal;
	public int getgMedal() {
		return gMedal;
	}
	public void setgMedal(int gMedal) {
		this.gMedal = gMedal;
	}
	public int getsMedal() {
		return sMedal;
	}
	public void setsMedal(int sMedal) {
		this.sMedal = sMedal;
	}
	public int getbMedal() {
		return bMedal;
	}
	public void setbMedal(int bMedal) {
		this.bMedal = bMedal;
	}
	
	public Medal(int gMedal, int sMedal, int bMedal) {
		super();
		this.gMedal = gMedal;
		this.sMedal = sMedal;
		this.bMedal = bMedal;
		
	}
	
	
}






//앞으로 20경기가 남아있고, 모든 국가가 메달을 획득 확률이 같다고 할 때, 최종 결과를 출력하시오.	
//1. 노르웨이 13 / 10 / 10  Total: 33
//2. ...
//...
//10. 일본    3 /  6 /  3  Total: 12