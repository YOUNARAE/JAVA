package chapter04;

import java.util.Scanner;

public class Exercise041 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 세 변의 길이를 입력받은 후, 
		 * 입력받은 변의 길이로 삼각형을 만들 수 있는지 판별하는 프로그램을 만들어 보자. 
		 * 삼각형을 판별하는 방법은 가장 긴 변의 길이가 
		 * 다른 두 변의 길이의 합보다 작으면 삼각형을 만들 수 있다.
		 */
		
		//입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요. : ");
		int a = scanner.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요. : ");
		int b = scanner.nextInt();
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요. : ");
		int c = scanner.nextInt();
		
		int abSum = a+b;
		int bcSum = b+c;
		int caSum = c+a;
		
		//출력
		if((a<bcSum)&&(b<caSum)&&(c<abSum)) {
			System.out.println("삼각형을 만들 수 있다");
		} else {
			System.out.println("삼각형을 만들 수 없다. 넌 실패야");
		}
	}

}
