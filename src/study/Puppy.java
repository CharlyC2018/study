package study;

public class Puppy {
	int puppyAge;
	String puppyName;
	
	public Puppy() {
	}

	public Puppy(String name) {
		puppyName = name;
		System.out.println("С����������" + name);
	}

	public void setAge(int age) {
		puppyAge = age;
	}

	public int getAge() {
		System.out.println("С��" + puppyName + "������Ϊ��" + puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =128;   
		byte b = (byte)i;
		
		Puppy myPuppy = new Puppy("JoJo");
		Puppy newPuppy = new Puppy("Caesar");
		myPuppy.setAge(5);
		newPuppy.setAge(0);
		myPuppy.getAge();
		newPuppy.getAge();
		newPuppy.puppyAge = myPuppy.puppyAge + 1;
		System.out.println(myPuppy.puppyName +"����ֵΪ��" + myPuppy.puppyAge);
		System.out.println(newPuppy.puppyName +"����ֵΪ��" + newPuppy.puppyAge);
		System.out.println(b);
	}
}