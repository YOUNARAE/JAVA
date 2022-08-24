package Chapter06.Exercise;

public class Circle {
	//필드
	double radius;
	double x;
	double y;

	//생성자
	public Circle() {
		
	}
	
	public Circle(double radius, double x, double y) {
		this.radius=radius;
		this.x=x;
		this.y=y;
	}
	
	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x=x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y=y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		if(radius<0) {
			this.radius = 0;
		} else {
			this.radius = radius;
		}
	}
	
	public double getArea() {
		double result = radius * radius * Math.PI;
		return result;
	}
	
}
