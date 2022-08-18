package Chapter06;

public class CarExample {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		car1.speed = 90;
		System.out.println(car1.speed);
		
		System.out.println();
		
		Car car2 = new Car();
		System.out.println(car2.company);
		System.out.println(car2.model);
		car2.color = "파랑";
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		System.out.println(car2.speed);
		
	}

}
