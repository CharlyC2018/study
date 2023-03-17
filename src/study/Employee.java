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
		System.out.println("名字:" + name);
		System.out.println("年龄:" + age);
		System.out.println("职位:" + designation);
		System.out.println("薪水:" + salary);
	}

}