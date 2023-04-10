package array;

import java.util.Arrays;

public class Test09 {
	public static void main(String[] args) {
		Woman[] woman = { 
				new Woman("a", 3), 
				new Woman("b", 60), 
				new Woman("c", 2) 
				};
		Arrays.sort(woman);
		System.out.println(Arrays.toString(woman));
	}
}

class Woman implements Comparable<Woman> {
	private String name;
	private int age;

	@Override
	public String toString() {
		return "Woman [name=" + name + ", age=" + age + "]";
	}

	public Woman(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Woman o) {
		Woman woman = (Woman) o;
		if (this.age > woman.age) {
			return 1;
		}
		if (this.age < woman.age) {
			return -1;
		}
		return 0;
	}
}