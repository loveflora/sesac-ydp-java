package _05_class._abstract._prac2;

public class Circle extends Shape {
	double radius;
	
	public Circle(String color, String type, double radius) {
		super(color, type);  // 부모 생성자 호출
		this.radius = radius;
	}
	
	double calculateArea () {
		return radius * radius * Math.PI;
	}
}
