package _05_class._inheritance.prac;

import _05_class._static.Student;

public class Animal {
	private String species;
    private String name;
    private int age;
    
    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }
    
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	void makeSound() {
		System.out.println("동물은 소리를 낸다.");
	}
	
	
	public void displayInfo() {
        System.out.println("=================");
        System.out.println("종 : " + getSpecies());
        System.out.println("이름 : " + getName());
        System.out.println("나이 : " + getAge());

        System.out.println();
       
	}
	
	
	public static void main(String[] args) {
		
		Cat cat = new Cat("냥이", 3, "검은색");
        Dog dog = new Dog("멍멍이", 2, "골든 리트리버");
	
        cat.displayInfo();
        cat.makeSound();
        dog.displayInfo();
        dog.makeSound();
	}
}
