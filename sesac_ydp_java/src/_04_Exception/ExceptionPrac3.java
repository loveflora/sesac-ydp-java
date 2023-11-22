package _04_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPrac3 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	try {System.out.println("배열의 크기를 입력하세요.");
		
	    int size = sc.nextInt();
		
		int[] intArr = new int[size];
		
		 System.out.println("배열 요소를 입력하세요.");
         int sum = 0;
         for (int i = 0; i < size; i++) {
             intArr[i] = sc.nextInt();
             sum += intArr[i];
         }
		 
		 double average = (double) sum / size;
		 
		 System.out.println("평균 : " + average);
		 
	 } catch (InputMismatchException e) {
        System.out.println("입력 형식이 올바르지 않습니다. 정수를 입력하세요.");
    } catch (NegativeArraySizeException e) {
        System.out.println("배열의 크기는 음수일 수 없습니다.");
    } catch (ArithmeticException e) {
        System.out.println("배열의 크기는 0이 될 수 없습니다.");
    } catch (Exception e) {
        System.out.println("예상치 못한 오류가 발생했습니다.");
    } 
}

}
