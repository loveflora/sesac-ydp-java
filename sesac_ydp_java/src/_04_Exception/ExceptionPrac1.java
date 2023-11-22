package _04_Exception;

public class ExceptionPrac1 {

	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4};
		
		for(int i=0; i < 5; i++){
            try{
                System.out.println(intArr[i]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스 범위를 벗어났습니다.");
            }
		}
	}
}
