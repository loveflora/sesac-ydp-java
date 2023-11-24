package _05_class._access_modifier._pack03;

public class B {
	
public void method() {
  A a = new A(); // A와 B는 같은 패키지
  
  // 필드 변경
  a.field1 = 11;  // O
  a.field2 = 22;  // O
//a.field3 = 33 // X : private field 이므로 같은 클래스에서만 접근 가능

// 메소드 호출
a.method1(); // O
a.method2(); // O
//a.method3(); // X : private method 이므로 같은 클래스에서만 호출 가능
  }
}
