package _05_class._abstract._prac1;

public abstract class Student {
	// 필드 선언
	String name;
	String school;
	int age;
	int studentNumber;
	
    // 생성자
    public Student(String name, String school, int age, int studentNumber) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.studentNumber = studentNumber;
    }
    
	abstract void todo();
    
    void printInfo() {
        System.out.println("==== " + name + " 학생의 정보 ====");
        System.out.println("학교: " + school);
        System.out.println("나이: " + age);
        System.out.println("학번: " + studentNumber);
    }
}

