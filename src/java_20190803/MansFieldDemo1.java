package java_20190803;

public class MansFieldDemo1 {
	public static void main(String[] args) {
		int score = Integer.parseInt(args[0]);
		String grade = null;
		switch (score) {
		case 1:
		case 2:
		case 3:
			grade = "bronze";
			break;
		case 4:
		case 5:
		case 6:
			grade = "silver";
			break;
		case 7:
		case 8:
		case 9:
			grade = "gold";
			break;
		case 10:
		case 11:
		case 12:
			grade = "platinum";
			break;
		default:
			grade = "Hujeob";
			
			
			
		}
		System.out.println("당신의 점수는 " + score +"이고 계급은 " + grade +"입니다.");
	}
}
