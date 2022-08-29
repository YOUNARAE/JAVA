package chapter07.Exercise;

public class Circle extends Shape {
	//필드
	private double radius;
	
	//생성자
	public Circle() {
		this.radius = radius;
	}
	
	//메소드
	@Override
	public double area() { 
		return radius * radius * Math.PI;
	}
	
	@Override
	public double perimeter() {
		return radius * 2 * Math.PI;
	}
	
	public String toString() {
		return String.format(super.toString());
	}

}
