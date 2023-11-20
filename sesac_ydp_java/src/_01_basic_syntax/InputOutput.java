package _01_basic_syntax;
	
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
	
		// 출력
		System.out.print("안녕하세요, \n"); // \n : 개행 
		System.out.println("저는 김새싹입니다. \n");
		System.out.println("잘 부탁드려요 !");
		
		// 입력
		System.out.println("공백으로 구분해서 이름, 나이, 키, 결혼여부 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		
		String name = sc.next();  // 공백 이전까지의 문자열 읽음
		int age = sc.nextInt();  // 공백 이전까지의 정수 읽음
		double height = sc.nextDouble(); // 공백 이전까지의 실수 읽음
		boolean single = sc.nextBoolean(); // 공백 이전까지의 불린 읽음
		
		System.out.println("=== 입력 결과 출력 ===");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("결혼 여부 : " + single);
		
		sc.close(); // Scanner 닫기
	}
}
