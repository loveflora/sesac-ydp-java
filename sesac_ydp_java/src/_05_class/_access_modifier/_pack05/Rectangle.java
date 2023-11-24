package _05_class._access_modifier._pack05;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle {
	private int width;
	private int height;
	
	
	
    public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 생성자의 매개변수에서 height 제거
	public Rectangle(int width){
        this.width = width;
    }
    
    public int getArea (){
        return this.width * this.height;
    }

    
	public static void main(String[] args) {
		ArrayList<Rectangle> rectangleList = new ArrayList<>();
		
		 Scanner sc = new Scanner(System.in);

		while(true) {
			 System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
			 int w = sc.nextInt();
		        int h = sc.nextInt();
			
	            if (w == 0 && h == 0) {
	                break;
	            }

	            Rectangle rectangle = new Rectangle(w);
		        rectangle.setHeight(h);
		        
		        rectangleList.add(rectangle);
		} 
	
	        
	        for (Rectangle rectangle1 : rectangleList) {
	            System.out.println("가로 길이는: " + rectangle1.getWidth());
	            System.out.println("세로 길이: " + rectangle1.getHeight());
	            System.out.println("넓이: " + rectangle1.getArea());
	            System.out.println("-------------------------");
	        }
	        
	        System.out.println("Rectangle 인스턴스의 개수는: " + rectangleList.size());
	
	}
}
