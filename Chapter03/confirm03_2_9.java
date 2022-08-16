package Chapter03;

import java.util.Scanner;

public class confirm03_2_9 {

	public static void main(String[] args) {
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수: ");
		double num1 = scanner.nextDouble();
		System.out.print("두번째 수: ");
		double num2 = scanner.nextDouble();
		
		//처리
		/*
		 * String result = (num2 == 0.0 || num2 ==0) ? "무한대" : num1/num2 + "";
		 * System.out.println("결과: "+result);
		 */System.out.println("--------------------");
		if ( (num2 == 0.0 || num2 ==0) ) {
			System.out.println("결과: 무한대");
		} else { 
			System.out.println("결과: "+num1/num2);
		}
		
	}

}
