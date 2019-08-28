package Practice;

public class olympic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Country [] Countries = new Country[10];
		
		Countries[0] = new Country("노르웨이", 10, 9 ,8);
		Countries[1] = new Country("독일", 9, 5 ,4);
		Countries[2] = new Country("네덜란드", 6, 5 ,2);
		Countries[3] = new Country("캐나다", 5, 5 ,6);
		Countries[4] = new Country("미국", 5, 3 ,2);
		
		Countries[5] = new Country("스웨덴", 4, 3 ,0);
		Countries[6] = new Country("오스트리아", 4, 2 ,4);
		Countries[7] = new Country("프랑스", 4, 2 ,4);
		Countries[8] = new Country("대한민국", 3, 2 ,2);
		Countries[9] = new Country("일본", 2, 5 ,3);
		
		//System.out.println("테스트: "+Countries[0].toString());
		
		for(int i =0 ; i < 20; i++) {
			int randomIndex = (int)(Math.random()*10);
			Countries[randomIndex].gold++; 
			randomIndex = (int)(Math.random()*10);
			Countries[randomIndex].silver++;
			randomIndex = (int)(Math.random()*10);
			Countries[randomIndex].bronze++;
			}// 랜덤으로 금은동
		
		Country tmp;
		
		//정렬
		for(int i = 0 ; i< Countries.length ; i++) {
			for(int j =i+1 ; j < Countries.length-1; j++) {
				if(Countries[j].total < Countries[j+1].total){
					tmp = Countries[j+1];
					Countries[j+1] = Countries[j];
					Countries[j] = tmp;					
				}
				
			}
		}
		
		for(int i = 0 ; i < Countries.length ; i++) {
			System.out.println(i+1+". "+Countries[i].toString());
			
		}
		

	}//main

}

class Country{
	
	String name;
	int gold;
	int silver;
	int bronze;
	int total;
	
	
	Country(String name, int gold, int silver, int bronze){
		
		this.name = name;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
		this.total = gold + silver + bronze;
	}
	
	
	public String toString() {
		
		return String.format("%s %d / %d / %d Total: %d\n",name, gold, silver,bronze, total);
	}
}



//앞으로 20경기가 남아있고, 모든 국가가 메달을 획득 확률이 같다고 할 때, 최종 결과를 출력하시오.	
//1. 노르웨이 13 / 10 / 10  Total: 33
//2. ...
//...
//10. 일본    3 /  6 /  3  Total: 12