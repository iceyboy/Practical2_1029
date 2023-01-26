package people;

public class Person {

	private String name;
	private String city;
	private int age;
	private double height;

	public String getDetails() {

		return "Name: " + name + ", City: " + city + ", Age: " + age + ", Height: " + height;

	}

	public Person(String name, String city, int age, double height) {

		this.name = name;
		this.city = city;
		this.age = age;
		this.height = height;

	}

	public void setAge(int age) {

		if (age > this.age) {

			this.age = age;

		}

	}

	public void setHeight(int height) {

		if (height > this.height) {

			this.height = height;

		}

	}

	public int getAge() {

		return this.age;

	}

	public double getHeight() {

		return this.height;

	}

	public String getName() {

		return this.name;

	}

	public String getCity() {

		return this.city;

	}

}
