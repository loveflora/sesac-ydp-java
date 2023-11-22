package _03_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String>strings = new ArrayList<>();

		System.out.println("문자를 입력해주세요. : ");
		
		
		while (true) {
			// 입력
            String input = sc.next();

            // "exit"을 입력하면 입력 종료
            if (input.equals("exit")) {
                break;
            }

            strings.add(input);
        }
		
		// 입력된 값 출력
		for (String s : strings) {
	          System.out.println(s + " ");
	     }
	}
}
