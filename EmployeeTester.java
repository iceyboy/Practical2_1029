package week31029;

public class EmployeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee bob = new Employee("bob", 30000.00);
		
		System.out.println(bob.getName());
		
		System.out.println(bob.getSalary());
		
		bob.raiseSalary(50);
		
		System.out.println(bob.getSalary());
				
	}

}

