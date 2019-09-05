package Practice;

public class TestContent {
	콘솔
	java -version

	ipconfig

	path


	자바
	객체지향언어이며 os에~

	3.getter setter 만들기

	패키지 작성해보고 패키지 장점 1.같은 성격의 클래스들을 서로 묶을 수 있다.(사용편리[자바파일관리]
	,배포시 개발자들이 찾기 용이,문서화[패키지별로 doc폴더로 묶어줌])

	package aa;


	Scanner sc = new Scanner(System.in); 입력받아서 next에 코딩
	import해야됨. java.util.*    /    java.util.scanner
	sc.next() ~~~~~

	network - server socket
	client - socket

	tcp 전화기/ udp편지 특징 비교
	udp 보낸 다음 쌩까. 그 뒤로는 몰라.(data가 서버에 갔는지 안갔는지 알 수가 없음)
	tcp는 연결지향. client메시지가 서버쪽으로 보내지는걸 확실히 알수 있음. 응답을 통해
	udp는 비연결지향. response 안함. 보내고 끊어버림. data의 안정성 보장불가능

	프로토콜 = 클라이언트와 서버간의 혼신규약(?)
	21 : ftp
	80 : http

	javac를 이용해 compile
	java를 이용해 실행

	overriding 작성규칙(부모에 있는거 재정의) 
	1.2.3.
	4.예외처리는 부모가 더 크거나 같아야함. 자식은 없어도 됨.

	overloading의 성립조건(한 클래스 내에서 메소드 이름을 같이 쓸 수 있다.) parameter가 다르던지 혹은 개수가 다르던지

	모니터 표준 출력 양식. System.out.println();

	jdbc  class.forname 드라이브 노드
		connection 데이터베이스 연결
		pstmt sql문 전송
		 rs sql문 결과 있을때 처리하는 기능

	매개변수 유무, 반환형 유무 메서드 4개

	형변환 - auto casting, casting(수동)

	student클래스 변수 2개 생성자 만들고 세터게터 만들어라.

	ip에 대해 설명해라.

	implement   extend
	반드시 오버라이딩해줘야됨.

	객체지향관점에서 상속에 대해 서술하라.(5개 이상) ex. (상속하면)코드의 가독성이 높아진다. 다형성 구현할 수 있다.

	dao를 코딩할 줄 알면 맞히는 20번 문제~
	pstmt.setInt(
	pstmt.setString(
	pstmt.executeUpdate();

	1.콘솔창에서 Java 버전 확인방법
		java -version

	  콘솔창에서 아이피 보는 방법
		ipconfig

	  콘솔창에서 시스템의 Path 확인하기
		path

	2.  window-64bit 파일은 무엇이냐
	어떤 파일을 설치해야하느냐

	자바의 특징 2가지 이상 쓰시오

	3. 아파치 설치 

	4. UML 보고 클래스 작성(getter/setter)

	5. 패키지 작성을 해보고 장점을 기술하라
		package aa;
		
		같은 성격의 자바 클래스끼리 묶을 수 있다. (관리가 용이)
		사용하기에 편하다. 
		jar 로 압축해서 배포했을 때 다른 사용자가 사용하기 편하다
		DOC (문서화) 했을때 보기 편하다

	6. 키보드 입력받는 방법
	system.in (io 에서 하는법 / InputStreamReader(System.in) 이용) 

	import java.util.Scanner;
	Scanner sc = new Scanner(System.in);

	7. 네트워크 코딩시 서버쪽에서는 ServerSocket / 클라이언트쪽에서는 Socket

	8.   tcp / udp 비교 

	9. 프로토콜은 무엇인가 ( 21 : ftp , 80 : http)
	  프로토콜을 두개 이상 쓰시오.

	10. .java      ->     .class       ->       run(실행)
	             javac               java

	콘솔에서 java 실행해보기

	11. 오버라이딩의 작성 규칙 (3가지 이상)
		예외처리는 부모클래스가 크거나 같아야하며 자식클래스는 없어도 된다.

	12. 오버로딩의 성립 조건
		한클래스내에서 메서드 이름을 같게 쓸 수 있다.

	13. 변수를 출력할 때 System.out.println(); 표준 출력장치이다

	14. jdbc 에 대한 설명을 적으시오
	Class.forname(Driver 로드) / Connection / PreparedStatement / ResultSet    

	15. 자바의 메서드의 메서드의 반환형에 따라

	매개변수 반환형 기준

	매개변수가 있고 반환형이 있는 경우
	매개변수가 있고 반환형이 없는 경우
	매개변수가 없고 반환형이 있는 경우
	매개변수가 없고 반환형이 없는 경우

	16. 형변환에 대해 서술하라(명시적 형변환, 묵시적 형변환
	auto-casting / casting

	17. Student 클래스를 주고 변수를 2개 주고 생성자와 setter/getter 를 적어라

	18. 컴퓨터에서 ip를 확인하는 방법
	ip를 설명해보자

	19. 클래스에서 인터페이스에서 상속 받을땐 implements (오버라이딩 필수)
	클래스에서 클래스를 상속 받을땐 extends
	인터페이스에서 인터페이스로 상속받을땐 extends

	20. 상속에 대해 서술해봐라 (5개 이상)

	21. DAO를 잘 코딩하면 맞출 수 있다. 
	sql.toString();
	바인딩 변수 설정(2개) pstmt.setString , pstmt.setInt
	pstmt.executeUpdate();

}
