package chapter0702;

import chapter07.Calculator;
import chapter07.Vehicle;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.add(10);
		
		driver.drive(new Bus());
		driver.drive(new Taxi());
		driver.drive(new Vehicle());
		
		Vehicle vehicle = new Bus();
		
	}

}
