package _01_basic_syntax;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String name = sc.next();  // 공백 이전까지의 문자열 읽음
		
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();  // 공백 이전까지의 정수 읽음
		
		System.out.println("안녕하세요 ! " + name + "님(" + age + "세)");	

		sc.close(); // Scanner 닫기
	}
}
