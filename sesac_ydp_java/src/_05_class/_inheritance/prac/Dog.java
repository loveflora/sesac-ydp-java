package _05_class._inheritance.prac;

public class Dog extends Animal {
	private String behavior;
	
	 public Dog(String name, int age, String behavior) {
	        // Cat 클래스에서는 "고양이"로 고정하고, 나머지 값은 생성자를 통해 초기화
	        super("강아지", name, age);
	        this.behavior = behavior;
	    }
	 
	 @Override
	    public void makeSound() {
	        System.out.println("멍멍");
	    }
}
