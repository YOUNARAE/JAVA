package chapter04;

import java.util.Scanner;

public class confirm04103 {
	public static void main(String[] args) {
		//입력
		System.out.println("등급은?");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		//출력
		System.out.print("당신은 ");
//      swich(score){
//		case 100:
//		case 98:
//		case 99:
//		case 97:
//		case 96:
//		case 95:
//		case 94:
//		case 93:
//		case 92:
//		case 91:
//		case 90:
//			System.out.println("A 등급입니다");
//			break;  직관적이게 적어도 된다.
		switch(score/10) {
		//(score - score % 10)
		
		case 10:
		//case 100:
		case 9:
			System.out.println("A 등급입니다");
			break;
		case 8:
			System.out.println("B 등급입니다");
			break;
		case 7:
			System.out.println("C 등급입니다");
			break;
		case 6:
			System.out.println("D 등급입니다");
			break;
		
		default :
			System.out.println("F 등급입니다");
		}
	}
}
