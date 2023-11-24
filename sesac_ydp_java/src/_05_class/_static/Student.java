package _05_class._static;

public class Student {
	private String name ;
	private int student_ID;
	private int grade;
	
	  public Student(String name, int student_ID, int grade) {
	        this.name = name;
	        this.student_ID = student_ID;
	        this.grade = grade;

	        // 생성자를 통해 학생이 생성될 때마다 totalStudents 값을 증가
	        totalStudents++;
	    }

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudent_ID() {
		return student_ID;
	}
	public void setStudent_ID(int student_ID) {
		this.student_ID = student_ID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	static int totalStudents;
	
	public void displayInfo() {
        System.out.println("===== 학생 정보 =====");
        System.out.println("이름: " + getName());
        System.out.println("학번: " + getStudent_ID());
        System.out.println("학년: " + getGrade());
        System.out.println();
        
	}
	
	
	public static void main(String[] args) {
		
        // 생성자를 통해 학생 객체 생성
        Student student1 = new Student("김새싹", 20231001, 1);
        Student student2 = new Student("박지은", 20231002, 2);
        Student student3 = new Student("이은지", 20231002, 3);
	
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();

        // 총 학생 수 출력
        System.out.println("총 학생 수는 " + totalStudents + "명 입니다.");
		
	}
}
