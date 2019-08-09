package Practice;

public class DeskDemo {
	public static void main(String[] args) {
		
		Desk d1 = new Desk();
		d1.product = "desk";
		d1.ingredient = "steel";
		d1.date = "1주일";
		
		d1.arrive();
		
		Desk d2 = new Desk();
		d2.product = "desk";
		d2.ingredient = "wood";
		d2.date = "3일";
		
		d2.arrive();
		
		Desk d3 = new Desk();
		d3.product = "desk";
		d3.ingredient = "rubber";
		d3.date = "1년";
		
		
		
		d3.arrive();
	}
}
