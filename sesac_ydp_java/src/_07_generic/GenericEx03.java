package _07_generic;


// 사람 객체 간 상속 관계
class Person {}
class Teacher extends Person {}
class Student extends Person {}
class WebStudent extends Student {}
class MobileStudent extends Student {}

// 등록 객체
// - 특정 종류(T) 등록을 나타내는 클래스
class Applicant<T> {
	public T kind;
	public Applicant(T kind) {
		this.kind = kind;
	}
}

// 최상단 클래스 : Object 

// 과정
// - getClass() : 클래스 정보 반환  --- ex) class java.lang.String
// - getSimpleName() : 클래스의 간결한 이름 반환

class Course {
	// Course A : Person 이라면 누구나 등록 가능
	// => 어떠한 타입도 가능하다 => ? 와일드 카드 사용
	public static void registerCourseA(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+ "(이)가 Course A 등록하셨습니다.");
	}
	
	// Course B : Teacher나 Student 가 아닌 Person만 등록 가능
	// <? super Teacher> : ? 는 Teacher의 부모
	public static void registerCourseB(Applicant<? super Teacher> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+ "(이)가 Course B 등록하셨습니다.");
	}
	
	// Course C : Student만 등록 가능
	// <? extends Teacher> : ? 는 Teacher의 자식
	public static void registerCourseC(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()+ "(이)가 Course C 등록하셨습니다.");
	}
}

public class GenericEx03 {

	public static void main(String[] args) {
		
		// Course A
		Course.registerCourseA(new Applicant<Person>(new Person()));  // Person(이)가 Course A 등록하셨습니다.
		Course.registerCourseA(new Applicant<Teacher>(new Teacher()));  // Teacher(이)가 Course A 등록하셨습니다.
		Course.registerCourseA(new Applicant<Student>(new Student()));  // Student(이)가 Course A 등록하셨습니다.
		Course.registerCourseA(new Applicant<WebStudent>(new WebStudent()));  // WebStudent(이)가 Course A 등록하셨습니다.
		Course.registerCourseA(new Applicant<MobileStudent>(new MobileStudent()));  // MobileStudent(이)가 Course A 등록하셨습니다.

		
		// Course B
		Course.registerCourseB(new Applicant<Person>(new Person()));  // Person(이)가 Course B 등록하셨습니다.
		Course.registerCourseB(new Applicant<Teacher>(new Teacher()));  // Teacher(이)가 Course B 등록하셨습니다.
//		Course.registerCourseB(new Applicant<Student>(new Student()));  // Error !
//		Course.registerCourseB(new Applicant<WebStudent>(new WebStudent()));  // Error !
//		Course.registerCourseB(new Applicant<MobileStudent>(new MobileStudent()));  // Error !


		// Course C
//		Course.registerCourseC(new Applicant<Person>(new Person()));  // Error !
//		Course.registerCourseC(new Applicant<Teacher>(new Teacher()));  // Error !
		Course.registerCourseC(new Applicant<Student>(new Student()));  // Student(이)가 Course C 등록하셨습니다
		Course.registerCourseC(new Applicant<WebStudent>(new WebStudent()));  // WebStudent(이)가 Course C 등록하셨습니다.
		Course.registerCourseC(new Applicant<MobileStudent>(new MobileStudent()));  // MobileStudent(이)가 Course C 등록하셨습니다.

	}

}
