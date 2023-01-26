package usingobjects;

import java.util.Scanner;

public class ScannerTest {

	static Scanner input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		input = new Scanner(System.in);
		String name; // name of a person
		String city; // location of a person
		int age; // age a person
		double height; // height (in metres) of a person
		int count = 5;
		String all = "";
		// Read in some data for a person
		
		do {
		
		System.out.println("Enter name: ");
		name = input.next(); // will read as a line of text
		System.out.println("Enter city: ");
		city = input.next();
		city = city.toUpperCase();
		System.out.println("Enter age: ");
		age = input.nextInt();
		System.out.println("Enter height (in metres): ");
		height = input.nextDouble();

		// output data
		System.out.println();
		System.out.println("Name: " + name);
		System.out.println("City: " + city);
		System.out.println("Age: " + age);
		System.out.println("Height: " + height);
		
		all += name + " " + city + " " + age + " " + height;
		
		count--;
		
		}while(count > 0);
		
		System.out.println(all);

		input.close();

	}

}
