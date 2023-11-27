package _05_class._abstract._prac1;

public class StudentEx {

	public static void main(String[] args) {
		Kim k = new Kim("김철수","ABC 고등학교",17,20220001);
		Baek b = new Baek("백영희", "XYZ 고등학교", 18, 20220002);
		
		k.printInfo();
		k.todo();
		b.printInfo();
		b.todo();
	}
}
