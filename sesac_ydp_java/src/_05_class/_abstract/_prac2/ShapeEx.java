package _05_class._abstract._prac2;

import java.util.ArrayList;
import java.util.List;

public class ShapeEx {

	public static void main(String[] args) {
        Circle c = new Circle("Red", "Circle", 5.0);
        Rectangle s = new Rectangle("Blue", "Rectangle", 4.0, 6.0);
        
       
		List<Shape> shapes = new ArrayList<>();
		shapes.add(c);
		shapes.add(s);
		
	      for (Shape shape : shapes) {
	            System.out.printf("=== %s 도형의 정보 ===\n", shape.getType());
	            System.out.printf("도형의 색상: %s\n", shape.getColor());
	            System.out.printf("도형의 넓이: %s\n", shape.calculateArea());
	            System.out.println();
	        }
	}

}
