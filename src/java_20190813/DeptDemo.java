package java_20190813;

import java.util.ArrayList;

public class DeptDemo {
	public static void main(String[] args) {
		DeptDao dao = DeptDao.getInstance();
		boolean isSuccess = false;
		
//		isSuccess = dao.insert(new DeptDto(50,"Development","강남역"));
//		if(isSuccess) {
//			System.out.println("부서가 추가되었습니다.");
//		}else {
//			System.out.println("추가 오륭");
//		}
//		
//		isSuccess = dao.update(new DeptDto(50,"개발부","서초역"));
//		if(isSuccess) {
//			System.out.println("부서가 수정되었습니다.");
//		}else {
//			System.out.println("수정 오륭");
//		}
		
		ArrayList<DeptDto> list = dao.select();
		
		for (DeptDto d : list) {
			int no = d.getNo();
			String name = d.getName();
			String loc = d.getLoc();
			System.out.printf("%d , %s , %s%n",no,name,loc);
		}
		
//		isSuccess = dao.delete(50);
//		if(isSuccess) {
//			System.out.println("부서가 삭제되었습니다.");
//		}else {
//			System.out.println("삭제 오륭");
//		}
	}
}
