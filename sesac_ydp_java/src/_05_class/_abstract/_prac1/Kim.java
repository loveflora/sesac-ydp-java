package _05_class._abstract._prac1;

//구체적인 클래스

public class Kim extends Student {
    public Kim(String name, String school, int age, int studentNumber) {
        super(name, school, age, studentNumber);
    }
	
 // 오버라이딩된 todo 메소드
    void todo() {
        System.out.println("점심은 김가네 김밥\n");
    }
}
