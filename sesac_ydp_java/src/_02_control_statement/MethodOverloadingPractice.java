package _02_control_statement;


public class MethodOverloadingPractice {

	public static void main(String[] args) {
		// 1. 객체 생성
		MethodOverloadingPractice ol = new MethodOverloadingPractice();

		// 2. 객체의 메소드 사용
		ol.circle(5);
		ol.rec(4, 7);
		ol.tri(6, 3);
	}
	

	public void circle(int a) {
	    System.out.println("반지름이 " + a + "인 원의 넓이 : " + (a * a * Math.PI)); 
	}

	public void rec(int a, int b) {
		System.out.println("가로 " + a + " 세로 " + b + "인 직사각형의 넓이 : " + a * b); 
	}

	public void tri(int a, int b) {
		System.out.println("밑변 " + a + " 높이 " + b + "인 삼각형의 넓이 : " + a * b / 2); 
	}

}
