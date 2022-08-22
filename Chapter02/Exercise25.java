package chapter02;

import java.util.Scanner;

public class Exercise25 {
	/*사용자로부터 500원, 100원, 50원, 10원짜리 동전의 갯수를 입력 받아 
	 * 저금통 안에 총 얼마가 들어 있는지 출력하는 프로그램을 만들어 보자.*/

	public static void main(String[] args) {
		//입력
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("500원 짜리 동전의 갯수: ");
		int coin1 = scanner.nextInt();
		
		System.out.println("100원 짜리 동전의 갯수: ");
		int coin2 = scanner.nextInt();
		
		System.out.println("50원 짜리 동전의 갯수: ");
		int coin3 = scanner.nextInt();
		
		System.out.println("10원 짜리 동전의 갯수: ");
		int coin4 = scanner.nextInt();
		
		//처리
		int sumNum = (coin1*500)+(coin2*100)+(coin3*50)+(coin4*10);
				
		//출력
		System.out.printf("저금통 안의 동전의 총 액수: %,d", sumNum);
	}

}
