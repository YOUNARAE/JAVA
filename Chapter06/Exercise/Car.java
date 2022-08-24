package Chapter06.Exercise;

public class Car {
	// 필드
	private double speed;
	private String color;
	//TODO 자동차의 최대 속력 변경하기-Task에서 찾을 수 있따
	private static final double MAX_SPEED = 200;

	// 생성자
	public Car() {
	}

	
	public Car(String color) {
		this.color = color;
	}

	// 메소드
	
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	// 자동차색깔
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	// 자동차속도
	public double getSpeed() {
		return speed;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public boolean speedUp(double speed) {
		/*if ((speed + this.speed) >= 0 && (speed + this.speed) <= MAX_SPEED) {
			this.speed += speed;
			return true;
		} else {
			return false;
		} */
		//선생님이 풀어주신 것
		/*
		 * 축약
		 * this.speed + speed; 드래그해서 컨트롤 + 1;
		 * double newSpeed = this.speed + speed;
		if( newSpeed > MAX_SPEED || newSpeed <0) {
			return false;
		} 
		 */
		if( this.speed + speed > MAX_SPEED || this.speed + speed <0) {
			return false;
		} 
		this.speed += speed;
		return true;
	}

	public String toString() {
		return String.format("%d", speed);
	}

}
