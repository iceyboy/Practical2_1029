package week31029;

public class Employee {
	
	private String name;
	private double salary;
	

	public Employee(String employeeName, double currentSalary) {
		
		this.name = employeeName;
		this.salary = currentSalary;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public double getSalary() {
		
		return this.salary;
		
	}
	
	public void raiseSalary(int percentage) {
		
		this.salary = salary * (1 + (percentage / 100));
		
	}
	
	
	
}

