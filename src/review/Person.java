// I chonged this file - gordon
package review;

enum Gender {
	OTHER, MALE, FEMALE
}

public class Person {
	private int age;
	private String name;
	private Gender gender;

	public Person(int age, String name, Gender g) {
		this.age = age;
		this.name = name;
		this.gender = g;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public Gender getGender() {
		return this.gender;
	}

}
