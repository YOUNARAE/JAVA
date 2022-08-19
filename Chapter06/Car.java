package Chapter06;

public class Car {
	//class 클래스명 {}
	//new 클래스명();
	//new라고 쓰는 순간 객체들이 만들어진다(heap공간에)
	
	//필드(자동차를 만들때마다 같이 만들어지는 세트)
	String company = "현대자동차";
	String model = "그랜저";
	String color; //초기값이 없으면 자동으로 defult 값으로 초기화해놓는다. defult 값:null
	int maxSpeed = 350;
    Car(){
    	
    }
	//-----필드들
	int speed; //int형은 초기값 0, 확인문제 1번에 2번예시
	void run() { // 메소드 안에 있는 것들은 지역변수
		boolean flag = false;
		speed =100;
		if(speed > 100){
			int range = 10;//확인문제 1번에 1번예시
		}
	}	
}
