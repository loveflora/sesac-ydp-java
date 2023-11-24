package _05_class._access_modifier._pack05;

// setter, getter 
// !!!!!!!! 내용 엄청 중요 !!!!!!!

public class Person {
	private int age;
	private String name;
	public Person(String name) {
		this.name = name;
	}
	
	//generate age, name 단축키 사용
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
