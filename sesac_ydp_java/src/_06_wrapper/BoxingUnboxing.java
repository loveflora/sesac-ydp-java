package _06_wrapper;

// Wrapper 객체
// - 기본 타입 (primitive type) 값을 갖는 객체를 생성
// - 컬렉션 객체는 기본 타입 값을 저장할 수 없어서, Wrapper 객체를 사용

public class BoxingUnboxing {
	public static void main(String[] args) {
		// 1. Boxing 
		// - 기본 타입 => 포장 객체
		// - 포장 클래스 변수에 값이 대입될 때 일어남
		Integer obj1 = 100;
		Double obj2 = 3.14;
		
		System.out.printf("int value: %d %n", obj1.intValue());  // 100 
		// intValue() : Integer 객체 내부의 int 값 return
		System.out.printf("double value: %.2f %n", obj2.doubleValue());  // 3.14
		// doubleValue() : Double 객체 내부의 double 값 return
		
		
		// 2. Unboxing
		// - 포장 객체 => 기본 타입
		// - 기본 타입 변수에 포장 객체가 대입될 때 일어남
		int value1 = obj1;
		double value2 = obj2;
		
		System.out.printf("int value: %d %n", value1);  // 100 
		System.out.printf("double value: %.2f %n", value2);  // 3.14
		System.out.println();
	
		// 연산 시, boxing
		int result = obj1 + 1;   // obj1 인 primitive type 인 1과 연산되기 전에 언박싱됨
		System.out.printf("result: %d %n", result);  // result: 101
		
	}
}
