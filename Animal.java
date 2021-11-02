package siddhi.course2.ds.algo;

public class Animal {
	char gender;
	int age;
	int weight;

	public Animal(int age, int weight, char gender) {
		this.age = age;
		this.weight = weight;
		this.gender = gender;
	}

	public void speak() {
		System.out.println("Gener : " + gender);
		System.out.println("Age: " + age);
		System.out.println("Weight: " + weight);
	}

	public void eat() {
		System.out.println("Eating...");
	}

	public void sleep() {
		System.out.println("Sleeping...");
	}
}
