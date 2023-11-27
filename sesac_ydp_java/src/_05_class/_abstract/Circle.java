package _05_class._abstract;

// 구체적인 클래스 - 도형 (원)

public class Circle extends Shape {
	public Circle(String color) {
		super(color);  // 부모 생성자 호출
	}
	
   // 추상 메소드 구현 
	// : 선언만 있고, 구현되지 않은 메소드
   void draw() {
	   System.out.println("원을 그리는 중입니다...");
   }
}
