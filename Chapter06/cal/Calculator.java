package Chapter06.cal;

public class Calculator { //Calculator라는 설계도로 실체하지 않음.
	int plus(int x, int y) {
		return x + y;
	}
	double avg (int x, int y) {
		double sum = plus(x,y);
		return sum / 2;
	}
	void execute() {
		double result = avg(7,10);
		println("실행 결과: " + result);
	}
	void println(String message) {
		System.out.println(message);
	}
}
