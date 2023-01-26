package people;

public class PersonTester {

	public static void main(String[] args) {

		// Create an instance of class Person
		Person p = new Person("Fred", "Belfast", 22, 1.14);
		
		// Get and display the details for Person p
		String details = p.getDetails();

		System.out.println(details);
		
		p.setAge(100);
		
		p.setHeight(140210421);
		
		System.out.println(p.getDetails());
		
		System.out.println(p.getAge());
		
		System.out.println(p.getCity());
		
		System.out.println(p.getHeight());
		
		System.out.println(p.getName());
		
	

	}

}
