package Chapter06.cal;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator calculator = new Calculator(); //생성을 해야만이 외부에서 만든 걸 쓸 수 있다
		calculator.execute();
		calculator.avg(7, 20);
	}

}
