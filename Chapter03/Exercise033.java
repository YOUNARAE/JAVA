package chapter03;

import java.util.Scanner;

public class Exercise033 {

	public static void main(String[] args) {
		/*
		 * 입력 연도가 윤년인지 아닌지 확인하는 프로그램을 작성해보자. 
		 * 윤년의 조건은 다음과 같다고 가정한다.
		 * 윤년은 4의 배수이어야 하고, 100의 배수는 아니어야 한다. 
		 * 또한 400의 배수는 무조건 윤년이 된다.
		 */
		
		//입력하기
		Scanner scanner = new Scanner(System.in);
		System.out.print("윤년인지를 확인할 연도를 입력하세요 : " );
		int leapYear = scanner.nextInt();
		
		//판단해주기
		
		if(leapYear%4==0&&leapYear%100!=0) {
			System.out.println(leapYear+"은 윤년입니다");
		} else if(leapYear%400==0) {
			System.out.println(leapYear+"은 윤년입니다");
		} else {
			System.out.println(leapYear+"은 윤년이 아닙니다");
		}
	
		//삼항연산자 이용하기
		/*
		 * String result = (year%400==0)?"입니다":((year%4==0)&&(!(year%100==0))?"입니다":"이 아닙니다");
		 * System.out.println(year+"년은 윤년"+result);	
		 */
	}
}
