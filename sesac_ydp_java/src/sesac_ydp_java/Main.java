package sesac_ydp_java;  

// 파일명과 클래스명 동일
// 다를 경우, Refactor > Rename으로 파일명 변경

// 1. 메인 클래스 (시작 클래스) 정의
// - main 메서드 가짐
// - 메인 클래스는 한 개 ! (Node에서 진입점 파일 역할)
public class Main {   // SesacStudents
	// 2. 주석
	// 1) // 한 줄
	// 2) /* 여러 줄 */
	// 3) /** 문서 주석 **/
	
	// 3. main 메소드
	// - java 운용 프로그램의 실행 시작점
	// - 애플리케이션이 실행되려면, 최소 1개 존재해야 함
	// - JVM은 세미콜론(;)으로 끝나는 문장을 하나의 명령문으로 인식	
	public static void main(String[] args) {
		System.out.print("안녕하세요?" + "wow");
		System.out.println("안녕하세요!"); // 개행 처리
		System.out.printf("안녕하세요~");
		
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("i = " + i);
		}
	}
}
