package _02_control_statement;

import java.util.Scanner;

public class PracticeCondition {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
			
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();  // 공백 이전까지의 정수 읽음
		
		if (age >= 20) {
			System.out.println("성인");
		} else if (age <= 19 && age >= 17) {
			System.out.println("고등학생");
		} else if (age <= 16 && age >= 14) {
			System.out.println("중학생");
		} else if (age <= 13 && age >= 8) {
			System.out.println("초등학생");
		} else if (age <= 7 && age >= 1) {
			System.out.println("유아");
		}

		sc.close(); // Scanner 닫기
	}

}
