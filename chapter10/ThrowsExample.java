package chapter10;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static void method1() throws Exception {
		Class.forName("java.lang.String");
	}

}
