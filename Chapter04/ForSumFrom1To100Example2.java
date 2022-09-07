package chapter04;

public class ForSumFrom1To100Example2 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		int i = 0;
		for( i=1; i<=100; i++) {
			sum += i; 
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);//마지막에 101이 되기때문에 -1을 빼준다
	}
}
