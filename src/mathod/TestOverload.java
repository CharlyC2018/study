package mathod;

public class TestOverload {

	public static void main(String[] args) {
		add();
		add(10);
		add(6);
		
	}
	
	static void add() {
	}
	
	static void add(int a) {
	}
	
	static void add(int b,int a) {}
	//static void add(int a,int b) {}
}