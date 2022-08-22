package Chapter06;

public class Calculator2Example {
	int a;
	void print() {
		System.out.println("print");
	}
	void run() {
		print();
		System.out.println("클래스 실행됨");
	}
	public static void main(String[] args) {
		//run();
		Calculator2Example example = new Calculator2Example();
		example.run();
		//원의 넓이 구하기
		//반지름 10
		//Calculator2 calculator2 = new Calculator2();
		//새로 생성한 거 없이.
		double result1 = 10 * 10 * Calculator2.pi;
		//메모리에 이미 있는 메소드니까 메모리상에 있는 걸로 접근하는게 좋겠다는 경고문이 뜨고 있다.
		int result2 = Calculator2.plus(10, 5);
		int result3 = Calculator2.minus(10, 5);
		//
		Calculator2 calculator2 = new Calculator2();//스택이라는 공간에 Calculator2가 생긴다.주소값이 참조가된다
		calculator2.multiply(10, 5);
		//
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
