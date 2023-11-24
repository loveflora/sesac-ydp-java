package _05_class._inheritance.prac;

public class Vehicle {
	private String brand;
    private String model;
    private int year;
    private int passengerCapacity;
    
    public Vehicle(String species, String name, int age) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.passengerCapacity = passengerCapacity;
    }
    
    
    void stop() {
		System.out.println("차량을 정지했습니다.");
	}
	
	
	public void displayInfo() {
        System.out.println("===== Bus 정보 =====");
        System.out.println("종 : " + getSpecies());

        System.out.println();
       
	}
	
}
