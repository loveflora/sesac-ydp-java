package _05_class._access_modifier._pack05;

public class SingletonEx {

	public static void main(String[] args) {
		// 생성자의 접근 제한자가 private 이기 때문에,
		// 다른 클래스에서 접근 불가
		// Singleton s1 = new Singleton();  // Error !
		
		// 정적 메소드 호출해서 싱글톤 객체를 얻음
		// 간접적으로 꺼내 옴
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();

		
	}

}
