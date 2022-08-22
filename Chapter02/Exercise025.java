package chapter02;

import java.util.Scanner;

public class Exercise025 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 500원, 100원, 50원, 10원짜리 동전의 갯수를 입력 받아 
		 * 저금통 안에 총 얼마가 들어 있는지 출력하는 프로그램을 만들어 보자.
		 */
		

		Scanner scanner = new Scanner(System.in);	
		System.out.print("500원짜리 동전의 갯수 : ");
		int coinNum500 = scanner.nextInt();
		System.out.print("100원짜리 동전의 갯수 : ");
		int coinNum100 = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수 : ");
		int coinNum50 = scanner.nextInt();
		System.out.print("10원짜리 동전의 갯수 : ");
		int coinNum10 = scanner.nextInt();

		int coin500 = 500;
		int coin100 = 100;
		int coin50 = 50;
		int coin10 = 10;
		
		int sum = (coin500 * coinNum500) + (coin100 * coinNum100) + (coin50 * coinNum50) + (coin10 * coinNum10);
		
		System.out.println("저금통 안의 동전의 총 액수 : "+sum);
	}

}
