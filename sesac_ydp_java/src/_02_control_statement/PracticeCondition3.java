package _02_control_statement;

import java.util.Scanner;

public class PracticeCondition3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int number = sc.nextInt();  // 공백 이전까지의 정수 읽음
		
		
		
		int i = 1;
		while(i <= number) {
			System.out.print(i + " ");
			i++;
		}


		
	}

}
