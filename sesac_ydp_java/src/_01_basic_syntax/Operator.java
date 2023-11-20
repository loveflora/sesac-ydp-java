package _01_basic_syntax;

public class Operator {

	public static void main(String[] args) {
		int x, y;
		double a, b;
		
		// 대입 연산자 (=)
		x = 10;
		y = 20;
		a = 5.0;
		b = 10.0;
		
		// 산술 연산자 : 숫자형 데이터에 대해 산술 연산 가능
		System.out.println("=== x, y ===");
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(y / x);
		System.out.println(x % y);
		
		System.out.println("=== a, b ===");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(b / a);
		System.out.println(a % b);
		
		// 증가, 감소 연산
		System.out.println("=== 증감 연산자 ===");
		System.out.println(x++ + " -> " + x);  // 후위 증가 (10 -> 11)
		System.out.println(++x + " -> " + x);  // 후위 증가 (12 -> 12)
		System.out.println(y-- + " -> " + y);  // 후위 감소 (20 -> 19)
		System.out.println(--y + " -> " + y);  // 전위 감소 (18 -> 18)
		
		// 산술적인 대입 연산
		System.out.println("=== 산술적인 대입 연산자 ===");
		System.out.println(x);  
		System.out.println(x += 5);  // x = x + 5
		System.out.println(x -= 5);  // x = x - 5
		System.out.println(x *= 5);  // x = x * 5
		System.out.println(x /= 5);  // x = x / 5
		System.out.println(x %= 5);  // x = x % 5
		
		// 비교 연산자
		System.out.println("=== 비교 연산자 ===");
		System.out.println(a);  // 5.0
		System.out.println(b);  // 10.0
		System.out.println(a > b);
		System.out.println(a >= b); 
		System.out.println(a < b); 
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		// 논리 연산자 
		boolean j = true;
		boolean k = false;
		boolean l = true;
		System.out.println("=== 논리 연산자 ===");
		// AND : 모두 참이어야 참 
		System.out.println(j && k);  // false
		System.out.println(j && l);  // true
		// OR : 둘 중 하나라도 참이면 
		System.out.println(j || k);  // true
		System.out.println(!j);  // NOT: 부정
		
		// 삼항 연산자
		System.out.println("=== 삼항 연산자 ===");
		System.out.println(x > y ? "x는 y보다 큼" : "x는 y보다 크지 않음");
		
		
	}
}
