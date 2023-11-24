package _05_class._access_modifier._pack05;


//* 디자인 패턴 (Design Pattern)
//: 자주 발생하는 문제, 자주 쓰이는 방법론 정리한 패턴

//"소프트웨어 공학" > 디자인 패턴

//GoF 디자인 패턴 종류
//1. 생성 패턴 > Singleton
//	: 클래스의 인스턴스가 하나임을 보장하는 패턴
//2. 구조 패턴
//3. 행위 패턴


public class SingletonEx {

	public static void main(String[] args) {
		// 생성자의 접근 제한자가 private 이기 때문에,
		// 다른 클래스에서 접근 불가
		// Singleton s1 = new Singleton();  // Error !
		
		// 정적 메소드 호출해서 싱글톤 객체를 얻음
		// 간접적으로 꺼내 옴
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();

		if(s2 == s3) {
			System.out.println("s2와 s3는 같은 참조를 가지므로, 같은 객체입니다.");
		} else {
			System.out.println("s2와 s3는 다른 참조를 가지므로, 다른 객체입니다.");
		}
		
		System.out.println(s2);
		System.out.println(s3);
	}

}
