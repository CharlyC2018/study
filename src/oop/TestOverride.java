package oop;

public class TestOverride {
	public static void main(String[] args) {
		Horse h= new Horse();
		h.run();
		h.getVehicle();
	}
}

class Vehicle{
	public void run() {
		System.out.println("running...");
	}
	
	public Vehicle getVehicle() {
		System.out.println("一个交通工具");
		return null;
	}
}

class Horse extends Vehicle{
	@Override
	public void run() {
		System.out.println("ddddd...");
	}
	
	@Override
	public Vehicle getVehicle() {
		return new Horse();
	}
}

class Plane extends Vehicle{}