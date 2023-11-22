package _03_array;

import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] intArr = new int[5];
		
		System.out.println("5개의 정수를 입력하세요");
		
		int sum = 0;
		
		for(int i = 0; i < intArr.length; i++) {
			intArr[i] = sc.nextInt();
			sum += intArr[i];
		}

		System.out.println("평균 : " + (double)sum/intArr.length);
	}
	
}
