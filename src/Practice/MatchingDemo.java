package Practice;

public class MatchingDemo {
	public static void main(String[] args) {
		
		
		Matching m1 = new Matching("정훈","남");
		Matching m2 = new Matching("용현","남");
		Matching m3 = new Matching("영섭","남");
		Matching m4 = new Matching("해찬","남");
		Matching m5 = new Matching("민석","남");
		
		Matching f1 = new Matching("혜정","여");
		Matching f2 = new Matching("현지","여");
		Matching f3 = new Matching("유진","여");
		Matching f4 = new Matching("민승","여");
		Matching f5 = new Matching("서영","여");
		
		Matching [] users = {m1,m2,m3,m4,m5,f1,f2,f3,f4,f5}; 
		
		
		for (int i = 0; i < users.length; i++) {
		    for (int j = i + 1; j < users.length; j++) {
		        Matching source = users[i];
		        Matching target = users[j];
		        if (source.gender != target.gender) {
		            if (Math.abs(source.point - target.point) < 0.8)
		                System.out.println(source.toString() + " - " + target.toString());
		        }
		    }
		}
		
		GetSetPractice gsp = new GetSetPractice();
		System.out.println(gsp.getName());
		
	}

}
