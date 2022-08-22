package chapter04;

import java.util.Scanner;

public class Exercise41 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 세 변의 길이를 입력받은 후, 
		 * 입력받은 변의 길이로 삼각형을 만들 수 있는지 판별하는 프로그램을 만들어 보자. 
		 * 삼각형을 판별하는 방법은 가장 긴 변의 길이가 
		 * 다른 두 변의 길이의 합보다 작으면 삼각형을 만들 수 있다.
		 */
			Scanner scanner = new Scanner(System.in);
			System.out.println("삼각형의 첫 번째 변의 길이를 입력하세요:");
			int i = scanner.nextInt();
			System.out.println("삼각형의 두 번째 변의 길이를 입력하세요:");
			int j = scanner.nextInt();
			System.out.println("삼각형의 세 번째 변의 길이를 입력하세요:");
			int k = scanner.nextInt();
			
			if(i>j+k) {
				System.out.println("삼각형을 만들 수 없습니다");
			} else if(j>i+k) {
				System.out.println("삼각형을 만들 수 없습니다");
			} else if(k>i+j) {
				System.out.println("삼각형을 만들 수 없습니다");
			} else {
				System.out.println("삼각형을 만들 수 있습니다");
			}
			
			/*if( (i<j+k )&& (j<i+k) && (k<j+i) ) {
				result="삼각형을 만들 수 있습니다");
			} else if  {
				result="삼각형을 만들 수 없습니다");
			}
			System.out.println(result);*/
	}
}
