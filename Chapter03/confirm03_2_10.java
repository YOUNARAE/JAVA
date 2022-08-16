package Chapter03;

public class confirm03_2_10 {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		
		String str = var2 + "." + var3;
		double var4 = var1 * var1 * Double.parseDouble(str);
		//var1 * var1 * Double.parseDouble(var2 + "." + var3);
		System.out.println("원의 넓이:" + var4);

	}

}
