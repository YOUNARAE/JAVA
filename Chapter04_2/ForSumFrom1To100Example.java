package Chapter04_2;

public class ForSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		for( int i=1; i<=100; i++ ) {
			
			sum += i;
			//sum = sum+i
			//1
			//3
			
		}
		System.out.println("1~100 합 : " + sum);
	}
}
