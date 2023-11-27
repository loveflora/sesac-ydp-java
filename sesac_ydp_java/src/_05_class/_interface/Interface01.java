package _05_class._interface;

interface Controller {
	void powerOn();
	void powerOff();
}

class Tv implements Controller {

	@Override
	public void powerOn() {
		System.out.println("TV 전원 ON");
		
	}

	@Override
	public void powerOff() {
		System.out.println("TV 전원 OFF");
	}
	
}


class Computer implements Controller {

	@Override
	public void powerOn() {
		System.out.println("Computer 전원 ON");
		
	}

	@Override
	public void powerOff() {
		System.out.println("Computer 전원 OFF");
	}
	
}



public class Interface01 {

	public static void main(String[] args) {
		// 객체 생성
		Tv tv = new Tv();
		Computer computer = new Computer();
		
		tv.powerOn();
		tv.powerOff();
		
		computer.powerOn();
		computer.powerOff();
	}
}
