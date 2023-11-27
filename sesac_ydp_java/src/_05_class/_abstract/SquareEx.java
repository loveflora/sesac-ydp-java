package _05_class._abstract;

public class SquareEx {

	public static void main(String[] args) {
		Circle c = new Circle("blue");
		Square s = new Square("yellow");
		
		c.start();
		c.draw(); // 추상 메소드의 구현
		// "원을 그리는 중입니다..."
		System.out.println("원의 색상은 " + c.getColor());
		
		s.start();
		s.draw(); // 추상 메소드의 구현
		// "사각형을 그리는 중입니다..."
		System.out.println("사각형의 색상은 " + s.getColor());
		
	}

}
