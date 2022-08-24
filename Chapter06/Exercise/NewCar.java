package Chapter06.Exercise;

public class NewCar {
	// 필드
	private double speed; // 마일 값으로 등록
	private String color;
	private static final double MAX_SPEED = killoToMile(200); // 마일

	// 생성자
	public NewCar() {
	}

	public NewCar(String color) {
		this.color = color;
	}

	// 메소드
	// 자동차 색깔
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 자동차속도
	// 내부 엔진은 마일로 표시
	public double getSpeed() {
		// 내부는 마일로 받은 상태, 밖에 표시시 킬로로 표시
		return MileToKillo(speed);
	}
	//내부는 마일로,외부는 킬로
	public void setSpeed(double speed) {
		// 입력시 마일로 변경
		this.speed = killoToMile(speed);
	}

	public boolean speedUp(double speed) {
		if (killoToMile(speed) + this.speed >= 0 && killoToMile(speed) + this.speed <= MAX_SPEED) {
			this.speed += killoToMile(speed);
			return true;
		} else {
			return false;
		}
	}

	public static double getMaxSpeed() {
		return MileToKillo(MAX_SPEED);
	}

	public String toString() {
		return String.format("%d", speed);
	}

	// 메소드 추가
	private static double killoToMile(double distance) {
		// km->mile 1.6km->1mile
		return distance / 1.6;
	}

	private static double MileToKillo(double distance) {
		// mile->km 1mile ->1.6km
		return distance * 1.6;
	}

}
