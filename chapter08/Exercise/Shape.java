package chapter08.Exercise;

public abstract class Shape implements Comparable<Shape>{

	//필드
	//생성자
	public Shape() {
	}

	//추상메소드로 변경
	public abstract double area();
	public abstract double perimeter();
	
	
	//비교할대상
	@Override
	public int compareTo(Shape shape) {
		if (this.area() > shape.area()) {
     		return 1;
 		} else if (this.area() < shape.area()) {
			return -1;
		} else { 
			return 0;
		}
	}//반대로 쓰면 내림차순으로 쓸 수 있다.
	
	
}
