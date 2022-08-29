package chapter07.Exercise;

public class Rectangle extends Shape {
	//필드
	private double width;
	private double height;
	
	//생성자
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	//메소드
	@Override
	public double area() {
		return width * height; 
	}
	
	@Override
	public double perimeter() {
		return width + width + height + height;
	}
	
	public String toString() {
		return String.format("도형의 모양 : 직사각형, 둘레:"+perimeter);
	}
	
}
