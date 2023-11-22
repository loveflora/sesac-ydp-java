package _02_control_statement;

import java.util.Scanner;

public class MethodPractice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 두 개 입력하세요.");
		double num1 = sc.nextDouble();  
		double num2 = sc.nextDouble(); 
		
		System.out.println("덧셈 결과 : " + sum(num1, num2));
		System.out.println("뺄셈 결과 : " + minus(num1, num2));
		System.out.println("나눗셈 결과 : " + divide(num1, num2));
		System.out.println("곱셈 결과 : " + mul(num1, num2));
	}
	
	public static double sum(double x, double y) {
		return x + y;  
	}
	
	public static double minus(double x, double y) {
		return x - y;  
	}
	
	public static double divide(double x, double y) {
		return x * y;  
	}
	
	public static double mul(double x, double y) {
		return x * y;  
	}
}
