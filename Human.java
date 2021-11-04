
public class Human {

	String name;
	int age;
	int height;
	String eyeclr;
	

	public Human(String name, int age, int height, String eyeclr) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.eyeclr = eyeclr;
	}

	public void speak() {
		System.out.println("Name: " + name);
		System.out.println("I am " + height + " " + "inches tall");
		System.out.println("Age: " + age);
		System.out.println("Eye colour: " + eyeclr);
	}

	public void eat() {
		System.out.println("eating...");
	}

	public void walk() {
		System.out.println("walking...");
	}

	public void work() {
		System.out.println("working...");
	}
}
