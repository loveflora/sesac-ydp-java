package _06_wrapper;

// 포장 값 비교
// - 래퍼 클래스는 참조형이기 때문에, 객체 내부 값을 비교할 때, 
//   ==, !- 연산자를 사용하기에 부적합
// - 객체 내부 값이 아닌, 포장 객체의 번지를 비교하기 때문
// - .equals() 메소드로 내부 값 비교하는 것이 바람직

public class ValueCompare {

	public static void main(String[] args) {

		// 단, 포장 객체의 효율적인 사용을 위해 아래 범위의 값을 갖는다면 포장객체는 공유됨 
		// 이외의 값은 내부 값이 아닌 참조값을 비교함을 주의할 것
		
		// -128 ~ 127 이내의 값을 가지는 경우
		Integer obj1 = 10;
		Integer obj2 = 10;
		System.out.printf("%d == %d : %b %n", obj1, obj2, obj1 == obj2);  // true
		System.out.printf("%d equals %d : %b %n", obj1, obj2, obj1.equals(obj2));   // true

		// -128 ~ 127 초과하는 값을 갖는 경우
		Integer obj3 = 1000;
		Integer obj4 = 1000;
		System.out.printf("%d == %d : %b %n", obj3, obj4, obj3 == obj4);  // false --> 번지 비교
		System.out.printf("%d equals %d : %b %n", obj3, obj4, obj3.equals(obj4));   // true --> 값을 비교
		
		Boolean bool1 = true;
		Boolean bool2 = true;
		System.out.printf("%b == %b : %b %n", bool1, bool2, bool1 == bool2);  // true 
		System.out.printf("%b equals %b : %b %n", bool1, bool2, bool1.equals(bool2));  // true 
		
		Character char1 = 'A';
		Character char2 = 'A';
		System.out.printf("%c == %c : %b %n", char1, char2, char1 == char2);  // true 
		System.out.printf("%c equals %c : %b %n", char1, char2, char1.equals(char2));  // true 
		
	    Character char3 = '\u0101'; // ā
	    Character char4 = '\u0101';
	    System.out.printf("%c == %c : %b %n", char3, char4, char3 == char4); // false
	    System.out.printf("%c equals %c : %b %n", char3, char4, char3.equals(char4)); // true
	}

}
