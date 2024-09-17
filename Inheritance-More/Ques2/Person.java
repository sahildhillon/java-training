package assignment_inheritance_1;

public class Person {
	private String name;
	private float age;
	public Person(String name, float age) {
		setName(name);
		setAge(age);
	}
	public Person(String name) {
		setName(name);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	
}
