package week31029;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car miata = new Car(10, 100, 1000);
		
		miata.drive(5);
		
		System.out.println(miata.getTankCapacity());
		
		System.out.println(miata.getFuel());
		
		miata.addFuel(100);
		
		System.out.println(miata.getFuel());
		
		fuelFullTank(miata);
		
		miata.drive(100);
		
		System.out.println(miata.getFuel());
		
		System.out.println(calculateFuelCost(100) + " pence.");	

	}
	
	public static void fuelFullTank(Car hi) {
		
		int fuelNeeded = hi.getTankCapacity() - hi.getFuel();
		
		hi.addFuel(fuelNeeded);
		
	}
	
	// convert cost per litre to cost per gallon
	
	public static double conversion() {
		
		double perLitre = 128.8;
		
		double perGallon = perLitre * 4.546;
			
		return perGallon;
		
	}
	
	public static double calculateFuelCost(int gallons) {
		
		double cost = gallons * conversion();
		
		return cost;
	
	}	

}
