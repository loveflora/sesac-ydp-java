package _05_class._access_modifier._pack05;

public class PersonEx {
	public static void main(String[] args) {
		Person p1 = new Person("minion");
		Person p2 = new Person("pooh");
		
//		p1.age = 5;  // Error
		// age 필드는 private로 선언했기에, 직접 접근할 수 없음.
		// => 직접 변경 불가.
	
		p1.setAge(5);  // => setter를 이용하여 값을 변경해야 함.
		System.out.printf("%s의 나이 : %d %n", p1.getName(), p1.getAge());
		// minion의 나이 : 5 
		
		p2.setAge(-6);
		System.out.printf("%s의 나이 : %d %n", p2.getName(), p2.getAge());
	    // pooh의 나이 : 0 
	}
	

}
