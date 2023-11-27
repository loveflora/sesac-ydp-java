package _05_class._prac;

// 서브 클래스: Car
class Car extends Vehicle {
	    public Car(String name, int maxSpeed) {
	        super(name, maxSpeed);
	    }

	    @Override
	    void move() {
	        System.out.println("도로를 따라 이동 중");
	    }
	    
	    

//		public void setSpeed(int speed) {
//			if(speed > car.getMaxSpeed()) {
//				this.speed = car.getMaxSpeed();
//			} else if (speed < car.getMaxSpeed()) {
//				this.speed = car.getMaxSpeed();
//			} else {
//				this.speed = speed;
//			}
//		
//			System.out.println("현재 속도 : " + this.speed);
//		}
	
}
