package Chapter06.car;

public class Car {

	//필드
	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
	  if(gas==0) {
		  System.out.println("gas가 없습니다.");
		  return false; //return을 쓰면 무조건 메소드를 종료시킨다. 리턴을 쓰면 if else를 안 쓸 수 있다.
	  } else {
		  System.out.println("gas가 있습니다");
		  return true; //에러 안 만들려면 기본값을 먼저 써놓는다
	  }
	}
	
	void run() {
		while(true) {
			if (this.gas > 0) {
				System.out.println("달립니다.(gas잔량 : "+this.gas+")");
				this.gas--;
			} else {
				System.out.println("멈춥니다.(gas잔량 : "+this.gas+")");
				return; //void가 리턴을 쓰는 메서드가 아닌데 쓰면 리턴은 브레이크와 같은 기능이 된다.
			}
		}
	}
}
