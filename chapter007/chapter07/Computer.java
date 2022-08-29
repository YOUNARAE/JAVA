package chapter07;

public class Computer extends Calculator {

	@Override
	double areaCircle(double radius) {
		//System.out.println(super.name);
		super.areaCircle(radius);
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * radius * radius;
	}
 	
}
