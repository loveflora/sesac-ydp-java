package _05_class;

import java.util.Scanner;

public class Rectangle {

    public int width;
    public int height;
	
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    public int getArea (){
        return this.width * this.height;
    }

    
	public static void main(String[] args) {
		 System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");

		 Scanner sc = new Scanner(System.in);
	        int w = sc.nextInt();
	        int h = sc.nextInt();
	        Rectangle rec = new Rectangle(w,h);
	        System.out.println(rec.getArea());
	}

}
