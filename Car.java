package week31029;

public class Car {
	
	private int fuelEfficiency = 0;
	private int fuel;
	private int capacity;
	
	public Car(int efficiency, int fuelAmount, int fuelCapacity) {
		
		this.fuelEfficiency = efficiency;
		this.fuel = fuelAmount;
		this.capacity = fuelCapacity;
		
	}
	
	public void drive(int miles) {
		
		System.out.println("I am driving!");
		
		int fuelUsed = miles / fuelEfficiency;
		
		this.fuel = fuel - fuelUsed;
		
		
	}
	
	public int getTankCapacity() {
		
		return this.capacity;
		
	}
	
	public int getFuel() {
		
		return this.fuel;
		
	}
	
	public void addFuel(int addAmount) {
		
		this.fuel = fuel + addAmount;
		
	}

}
