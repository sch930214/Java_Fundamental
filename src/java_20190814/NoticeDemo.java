package java_20190814;

import java.util.ArrayList;

public class NoticeDemo {
	public static void main(String[] args) {
		NoticeDao dao = NoticeDao.getInstance();
		boolean isSuccess = false;
		
//		isSuccess = dao.insert(new NoticeDto(0,"작가s","제목s","내용s",""));
//		if(isSuccess) {
//			System.out.println("내용이 추가되었습니다.");
//		}else {
//			System.out.println("추가 오륭");
//		}
		
//		isSuccess = dao.update(new NoticeDto(16,"작가r","제목r","내용r",""));
//		if(isSuccess) {
//			System.out.println("내용이 수정되었습니다.");
//		}else {
//			System.out.println("수정 오륭");
//		}
//		
//		ArrayList<NoticeDto> list = dao.select();
//		
//		for (NoticeDto n : list) {
//			int num = n.getNum();
//			String writer = n.getWriter();
//			String title = n.getTitle();
//			String content = n.getContent();
//			String regdate = n.getRegdate();
//			System.out.printf("%d , %s , %s , %s , %s%n ",num,writer,title,content,regdate);
//		}
//		
		isSuccess = dao.delete(16);
		if(isSuccess) {
			System.out.println("부서가 삭제되었습니다.");
		}else {
			System.out.println("삭제 오륭");
		}
	}
}
