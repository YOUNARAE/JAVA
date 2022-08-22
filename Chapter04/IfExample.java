package chapter04;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		System.out.print("점수를 입력해 : ");

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다");
			System.out.println("등급은 A 입니다");
		}
		if(score<90) {
			System.out.println("점수가 90점보다 낮습니다");
			System.out.println("등급은 B 입니다");
		}
	}
}
