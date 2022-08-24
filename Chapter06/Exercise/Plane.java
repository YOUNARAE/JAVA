package Chapter06.Exercise;

public class Plane {
	// 필드
	private String manufacture;
	private String model;
	private int maxNumberOfPassengers;
	private static int numberOfPlanes;//필드에 선언되어있지만 static은 사실 플레닛의 구성원이 아니다.
	

	// 생성자
	public Plane() {
		numberOfPlanes++;
	}

	public Plane(String manufacture, String model, int maxNumberOfPassengers) {
		this();//여기서 위에 Plane를 호출해온 것이다.
		this.manufacture = manufacture;
		this.model = model;
		this.maxNumberOfPassengers = maxNumberOfPassengers;
		//numberOfPlanes++;//static이라서 모든 곳에 공유할 수 있다
	}

	// 메서드
	public String getManufacture() {
		return manufacture;
	}

	public void setMenufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}

	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if (maxNumberOfPassengers > 0) {
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	}

	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}

	public String toString() {
		return String.format("%d", numberOfPlanes);
	}

}
