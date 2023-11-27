package _07_generic;

// 참고 : Number 클래스
// - Java 에서 모든 숫자 형식의 부모 클래스
// - 정수형, 실수형 데이터 타입을 모두 포함
// ex) Byte, Short, Integer, Long, Float, Double

// 제네릭 제한 CASE 1.
// - Box 클래스는 제네릭 타입 T를 받지만, 제한을 두어서 Number를 상속한 클래스만 허용
// - 아이템을 설정하고 반환하는 메서드 가짐

class Box<T extends Number> {
	private T item;
	
	public void setItem (T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}
}


//제네릭 제한 CASE 2.
// Moveable 인터페이스 선언
// 인터페이스명 관례 : -able
interface Moveable {
	void move(); // 추상 메소드 선언
}

// Moveable 인터페이스 구현하는 Car 클래스
class Car implements Moveable {
	@Override
	public void move() {
		System.out.println("자동차 출발 !");
	}
}

// - Container 클래스는 제네릭 타입 T를 받는다.
// - 그러나 타입 T는 제한이 있는데, Moveable 인터페이스를 구현한 클래스만 허용
class Container<T extends Moveable> {
	private T item;
	public Container(T item) {
		this.item = item;
	}
	public void makeItMove() {
		item.move();
	}
}  


public class GenericEx02 {

	public static void main(String[] args) {
		// 제네릭 제한에 어긋남 (제네릭 타입에 Number를 상속받지 않는 타입을 사용 중이므로)
		// Box<String> stringBox = new Box<>();    // X
		
		Box<Double> doubleBox = new Box<>();
		Double doubleValue = doubleBox.getItem();
		
		Box<Integer> integerBox = new Box<>();
		integerBox.setItem(1000);
		Integer integerValue = integerBox.getItem();
		System.out.println(integerValue);
		
	    Box<Short> shortBox = new Box<>();
	    // short 형변환?
	    // - Java 에서 정수 리터럴은 기본적으로 int로 간주된다.
	    // - 따라서, 42라는 short 형 값을 사용하고 싶다면 명시적 형변환 필요
	    shortBox.setItem((short) 42);
	    Short shortValue = shortBox.getItem();
	    System.out.println(shortValue);
	    
	    
	    /////////////////////////////////
	    
	    Container<Car> carContainer = new Container<>(new Car());
	    carContainer.makeItMove();
	}

}
