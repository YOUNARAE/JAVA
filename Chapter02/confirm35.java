package Chapter02;

import java.util.Scanner;

public class confirm35 {

	public static void main(String[] args) {
		/*
		 * scanner에서 문자열 받기
		 * next() => 공백을 입력하거나 엔터를 입력했을 때 까지의 글자를 반환
		 * nextLine() => 엔터를 입력했을 때
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		int num1 = scanner.nextInt();
		//String strNum1 = scanner.nextLine();
		System.out.print("두번째 수: ");
		int num2 = scanner.nextInt();
		//String strNum2 = scanner.nextLine();

//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println("덧셈 결과:"+result);
		
	}

}
