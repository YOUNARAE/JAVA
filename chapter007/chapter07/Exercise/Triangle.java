package chapter07.Exercise;

public class Triangle extends Shape {
	//필드
	private double side;
	
	//생성자
	public Triangle(double side) {
		this.side = side;
	}
	
	//메소드
	@Override
	public double area() {
		return Math.sqrt(3) * side * side / 4;
	}
	
	@Override
	public double perimeter() {
		return side * 3;
	}
	
	public String toString() {
		return String.format(super.toString());
	}


}
