package _05_class._abstract._prac2;

public abstract class Shape {
	String color;
	String type;

	 // 생성자
	public Shape(String color, String type) {
		this.color = color;
		this.type = type;
	}
	
	abstract double calculateArea();
	
	public String getType() {
		return type;
	}
	
	public String getColor() {
		return color;
	}
}
