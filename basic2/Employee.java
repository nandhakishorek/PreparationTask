package basic2;

public class Employee {
	private String name,gender,role;
	private int id,salary;
	private char initial;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public char getInitial() {
		return initial;
	}
	public void setInitial(char initial) {
		this.initial = initial;
	}
	public Employee(String name, String gender, String role, int id, int salary, char initial) {
		super();
		this.name = name;
		this.gender = gender;
		this.role = role;
		this.id = id;
		this.salary = salary;
		this.initial = initial;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", role=" + role + ", id=" + id + ", salary=" + salary
				+ ", initial=" + initial + "]";
	}
	

}
