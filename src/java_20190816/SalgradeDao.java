package java_20190816;

public class SalgradeDao {
	private static SalgradeDao single;
	private SalgradeDao() {
		
	}
	public static SalgradeDao getInstance() {
		if(single == null) {
			single = new SalgradeDao();
		}
		return single;
	}
}
