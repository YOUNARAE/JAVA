package chapter0702;

import chapter07.Vehicle;

public class Driver {
	
	public void add(int a) {
		System.out.println(a);
	}
	
	public void drive(Vehicle vehicle) {//Vehicle vehicle = new Bus();
		vehicle.run();
	}
}
