package java_20190816;

public class SalgradeDto {
	private int grade;
	private int lowsal;
	private int hisal;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getLowsal() {
		return lowsal;
	}
	public void setLowsal(int lowsal) {
		this.lowsal = lowsal;
	}
	public int getHisal() {
		return hisal;
	}
	public void setHisal(int hisal) {
		this.hisal = hisal;
	}
	public SalgradeDto(int grade, int lowsal, int hisal) {
		super();
		this.grade = grade;
		this.lowsal = lowsal;
		this.hisal = hisal;
	}

}
