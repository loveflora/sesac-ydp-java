package _01_basic_syntax;

// 형 변환
// - 데이터 타입 변환
// - (type) var
//   - type: 데이터 타입
//   - var: 변수

public class Casting {

	public static void main(String[] args) {
		// 1. 묵시적 형변환 (Wider Conversion)
		// - 작은 타입에서 큰 타입으로 자동 형변환
		// - 반대의 경우에는, 명시적으로 형 변환해야 함
		int smallNumber = 10;
		double bigNumber = smallNumber;  // int를 double로 자동 형변환
		
		System.out.println("smallNumber: " + smallNumber);  // 10
		System.out.println("bigNumber: " + bigNumber); // 10.0 (int형이 double형으로 자동 형변환)
		
		
		// 2. 명시적 형변환 (Narrow Conversion)
		// - 더 큰 타입에서 작은 타입으로 강제 형변환
		// - 큰 타입에서 작은 타입으로 강제 변환하다보니, 데이터 손실이 날 수 있음
		double anotherBigNumber = 20.5;
		int anotherSmallNumber = (int)anotherBigNumber;  // double를 int로 형변환
		
		System.out.println("anotherBigNumber: " + anotherBigNumber);  // 20.5
		System.out.println("anotherSmallNumber: " + anotherSmallNumber);  // 20
	}

}
