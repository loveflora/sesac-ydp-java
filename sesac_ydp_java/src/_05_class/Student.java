package _05_class;

// 클래스
// - 객체 지향 프로그래밍의 기초
// - 클래스를 통해 인스턴스 생성

public class Student {   // 공개 클래스 선언
	
	// 1. 필드 (멤버 변수)
	public String name;
	public int grade;
	
	// 2. 메소드
	// 2-1. 생성자 (new)
	public Student(String name, int grade) {
//		// this : 자기 자신을 의미
//		// this.name, this.grade : 현재 인스턴스의 name, grade 멤버 변수
//		// 멤버 변수와 매개변수 이름이 동일하다면, this를 이용하여 구분
		this.name = name;  // 매개변수의 name을 현재 객체의 name 멤버 변수에 할당
		this.grade = grade;  //  매개변수의 grade를 현재 객체의 grade 멤버 변수에 할당	
	}
	
	// this를 쓰지 않는 생성자
	// => 명확한 구분을 위해 this 쓰는 것이 바람직
//	public Student(String n, int g) {
//		name = n;
//		grade = g;
//	}
	
	// 2-2. 일반 메소드
	// 1) 인자 X, 반환값 X
    public void goToSchool() {
    	System.out.println("학교 가자 !");
    }
    
    
    // 2) 인자 O, 반환값 X
    public void study(String subject) {
    	System.out.printf("%s 과목 공부 중 !\n", subject);
    }
	
    // 3) 인자 X, 반환값 O
    public int getGrade() {
    	return this.grade;
    }
    
    // 4) 인자 O, 반환값 O
    public String getTestResult(int score) {
    	return this.name + " 학생의 점수 : " + score;
    }
    
    @Override
	public String toString() {
		return "Student{" + "name='" + name + "'," + " grade=" + grade+ "}";
	}
    
}
