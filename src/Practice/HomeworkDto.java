package Practice;

public class HomeworkDto {
	int seq;
	String id;
	String pwd;
	public HomeworkDto(int seq, String id, String pwd) {
		super();
		this.seq = seq;
		this.id = id;
		this.pwd = pwd;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
