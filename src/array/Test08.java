package array;

//使用Javabeen和数组保存表格数据
public class Test08 {
	public static void main(String[] args) {
		Emp[] emps = { new Emp(1001, "高淇", 18, "讲师", "2-14"), new Emp(1002, "高小七", 19, "助教", "10-10"),
				new Emp(1003, "高小琴", 20, "班主任", "5-5") };
		for (Emp emp : emps) {
			System.out.println(emp);
		}
	}
}

class Emp {
	private int id;
	private String name;
	private int age;
	private String job;
	private String hiredate;

	public Emp(int id, String name, int age, String job, String hiredate) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.job = job;
		this.hiredate = hiredate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", age=" + age + ", job=" + job + ", hiredate=" + hiredate + "]";
	}
}