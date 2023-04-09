package array;

public class Test01 {

	public static void main(String[] args) {
		int[] s;// 声明数组
		s = new int[10];// 给数组分配空间

		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		}

		System.out.println();

		for (int i = 0; i < s.length; i++) {
			s[i] = 2 * i + 1;// 给数组元素赋值; 数组是对象，数组中的元素就是数组的属性
			System.out.print(s[i] + " ");
		}
		
		System.out.println();
		
		Man[] men;// 声明数组
		men = new Man[10];// 给数组分配空间

		Man m1 = new Man(1, 11);//创建Man对象，将地址给m1
		Man m2 = new Man(2, 22);

		men[0] = m1;//将m1引用地址传给men[0]
		men[1] = m2;
		
		men[2] = new Man(3, 33);//创建Man对象，将地址给men[2]
		
		System.out.println(men[0].getId());
		System.out.println(men[1].getId());
		System.out.println(men[2].getId());
		
		System.out.println(m1.getAge());
		System.out.println(m2.getAge());
	}
}

class Man {
	private int age;
	private int id;

	public Man(int age, int id) {
		super();
		this.age = age;
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}