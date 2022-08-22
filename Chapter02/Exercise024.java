package chapter02;

import java.util.Scanner;

public class Exercise024 {
	public static void main(String[] args) {
/*
 * 원기둥 밑면의 반지름과 높이를 입력 받아서 
 * 밑면의 넓이와 부피를 계산하는 프로그램을 작성하여 보자. 
 * 원주율은 Math.PI를 사용한다.
 */
	Scanner scanner = new Scanner(System.in);
	//입력받기
	System.out.print("원기둥의 반지름을 입력하세요.(단위:cm) : ");	
	double radius = scanner.nextDouble();
	
	System.out.print("원기둥의 높이를 입력하세요.(단위:cm) : ");	
	double height = scanner.nextDouble();
	//계산하기
	
	double result1 = radius * radius * Math.PI;
	double result2 = result1 * height;
		
	//출력하기
	System.out.println("원기둥 밑변의 넓이는 "+result1+"이고, 원기둥의 부피는 "+result2+"이다.");
	}

}
