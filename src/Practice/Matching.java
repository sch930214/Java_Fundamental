package Practice;

public class Matching {
	String name;
	String gender;
	double point;
	
	public Matching(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
		this.point = Math.random()*5;
	}
	
	

	
	public String toString() {
	    return String.format("%s(%s: %.1f)", name, gender, point);
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String gender() {
		
		return gender;
	}
	public void setMale(String gender) {
		this.gender = gender;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}

}
