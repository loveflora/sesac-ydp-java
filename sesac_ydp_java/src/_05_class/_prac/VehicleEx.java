package _05_class._prac;

public class VehicleEx {

	public static void main(String[] args) {
		// Vehicle 배열을 만들어 Car와 Airplane 객체 저장
        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("Car", 120);
        vehicles[1] = new Airplane("Airplane", 10000);


        // 반복문을 사용하여 각 객체의 move() 메서드를 출력
        for (Vehicle vehicle : vehicles) {
            System.out.println("=== " + vehicle.getName() + "의 이동 ===");
            vehicle.move();
            
            System.out.println("최대 속도는 " + vehicle.getMaxSpeed());

            // Flyable 인터페이스를 구현한 객체인 경우 fly() 메서드도 호출
            if (vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly();
            }
   
        }
	}

}
