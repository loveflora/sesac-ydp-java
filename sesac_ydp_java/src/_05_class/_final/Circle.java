package _05_class._final;

import java.util.Scanner;

public class Circle {

    private final double radius;
    private static final double PI = Math.PI;
	

	public Circle(double r) {
		this.radius = r;
	}

	public double calculateArea() {
        return PI * radius * radius;
    }
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("원의 반지름을 입력하세요.");
	        double r = sc.nextDouble();

	        Circle circle = new Circle(r);

	        double area = circle.calculateArea();
	        
	        System.out.println("원의 반지름: " + r);
	        System.out.println("원의 넓이: " + area);
	    }

}
