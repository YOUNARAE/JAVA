package chapter09;

import chapter08.Vehicle;

public class AnonymousExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle() {
			@Override
			public void run() {
				System.out.println("실행");
			}
		};
		vehicle.run();
		
		new Vehicle() {
			public void run() { //구현해야될 메소드를 재정의해준다.
				System.out.println("실행");
			}
		}.run();//일회성으로 쓸 수 있다
	}
}
