package study;

public class Employee {
	public String name;
	private double salary;
	int age;
	String designation;

	public Employee(String empName) {
		name = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void empAge(int empAge) {
		// TODO Auto-generated method stub
		age = empAge;
	}

	public void empDesignation(String empDesig) {
		// TODO Auto-generated method stub
		designation = empDesig;
	}

	public void printEmployee() {
		// TODO Auto-generated method stub
		System.out.println("����:" + name);
		System.out.println("����:" + age);
		System.out.println("ְλ:" + designation);
		System.out.println("нˮ:" + salary);
	}

}