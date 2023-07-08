package basic3;

import java.util.Objects;

public class Student {
	private String name, gender;
	private int rollNumber, age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String name, String gender, int rollNumber, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.rollNumber = rollNumber;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", rollNumber=" + rollNumber + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	
	}

}
