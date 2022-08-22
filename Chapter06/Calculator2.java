package Chapter06;

public class Calculator2 {
	static double pi = 3.13159;
	static int result = 0;//환기대장은 괜찮지만 내 통장은 게시판에 달아놓는 것과 마찬가지라서 위험하다.
	//가능하면 필드에 static을 붙이는 것을 고려하지 마라.
	public Calculator2() {
		// 
	}
	static int plus(int x, int y) {
		//안된 : result = 20;
		//안됨 : this.result = 20;(아직 만들어지지 않은 상태라 에러가 난다)
		//쓰는 방법은 result에도 static을 붙이거나 밑에처럼 새로 생성하면 안된다
		//Calculator2 calculator2 = new Calculator2();
		//calculator2.result = 20;
		result = 20;
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
	int multiply(int x, int y) {
		//static 붙어있는 애가 안 붙어있는 애한테 쓰는 건 크게 문제가
		//안 붙은 곳에서 게시판은 얼마든지 볼 수 있다
		result = 100;
		double r = 2 * 10 * pi;
		
		//
		return x*y;
	}
}
