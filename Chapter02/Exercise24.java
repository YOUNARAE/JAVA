package chapter02;

import java.util.Scanner;

public class Exercise24 {

	public static void main(String[] args) {
		/*
		 * 원기둥 밑면의 반지름과 높이를 입력 받아서 밑면의 넓이와 부피를 계산하는 프로그램을 작성하여 보자. 
		 * 원주율은 Math.PI를 사용한다.
		 */
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("원기둥의 반지름을 입력하시오.(단위: cm): ");
		double radius = scanner.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		double height = scanner.nextDouble();
		
		//처리
		double pie = 3.141592653589793238462643383279502884197169399375105820974944;
		double result = radius * radius * pie; /*Math.PI*/
		double result2 = result * height;
		
		//출력
		System.out.println("원기둥의 밑변의 넓이는 " + result + "㎝이고, 부피는" + result2 + "㎠이다");
	}

}
