package chapter03;

import java.util.Scanner;

public class Confirm03209 {

	public static void main(String[] args) {
		//입력받는 곳
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		double first = scanner.nextDouble();
		System.out.print("두번째 수 : ");
		double second = scanner.nextDouble();
		
		if(second==0&&second==0.0) {
			System.out.println("결과 : 무한대");
		} else {
			double divide = first/second;
			System.out.println("----------------------------");
			System.out.println("결과 : "+divide);
	
		}	
		//출력하는 곳
	}

}
