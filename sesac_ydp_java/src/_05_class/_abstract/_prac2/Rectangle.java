package _05_class._abstract._prac2;

public class Rectangle extends Shape {
	double width;
	double height;
	
	public Rectangle(String color, String type, double width, double height) {
		super(color, type);  // 부모 생성자 호출
		this.width = width;
		this.height = height;
	}
	
	double calculateArea() {
		return width * height;
	}
}
