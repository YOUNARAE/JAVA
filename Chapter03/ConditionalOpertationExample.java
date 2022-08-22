package chapter03;

import java.util.Scanner;

public class ConditionalOpertationExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scanner.nextInt();
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : ((score > 70) ? 'C' : ((score > 60) ? 'D' : 'F')));
		System.out.println(score + "점은" + grade + "등급입니다");
	}
}
