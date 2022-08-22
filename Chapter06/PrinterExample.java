package Chapter06;

public class PrinterExample {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		//리턴타입은 모두 void이다. 반환하는 게 없으면 void를 쓴다
		//String이나 int같이 제시되어있어야 그 타입과 맞다.
		
		printer.println(10);
		printer.println(5.7);
		printer.println("홍길동");
		printer.println(true);
	}
}
 