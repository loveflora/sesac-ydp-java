package _02_control_statement;

import java.util.ArrayList;
import java.util.List;

public class LoopControl {

	public static void main(String[] args) {
		// 기본 for 문
		for (int i = 0; i <= 10; i++) {
			System.err.println(i + " ");
		}
		
		// while 문
		// - 조건식이 참일 동안 while 블럭 실행
		int i = 1;
		while(i <= 10) {
			System.out.println(i + " ");
			i++;
		}

		// do-while 문
		// - do 블럭이 먼저 실행 (적어도 한 번은 수행되는 반복문)
		int j = 1;
		do {
			System.out.println(j + " ");
			j++;
		} while (j <= 10);
		
		// for ~ each 문
		// - collection type 데이터에서 사용 가능
		// * collection type : 데이터를 저장하고 관리하는 자료구조를 제공하는 클래스 모음
		// ex. List, Vector 등
		String[] arr = {"A", "B", "C", "D"};  // 순서가 있는 배열을 {} 중괄호로 표시
		for(String a : arr) {
			System.out.println("a = " + a);
		}
		
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		for (String l: list) {
			System.out.println("l = " + l);
		}
		
	
	}	
}
