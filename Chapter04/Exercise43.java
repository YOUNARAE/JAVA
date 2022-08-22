package chapter04;

import java.util.Scanner;

public class Exercise43 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 5과목의 점수를 입력받아 평균을 구하는 프로그램을 작성하여 보자. 
		 * 평균 점수로 학점을 계산하여 출력한다. 
		 * (평균 점수는 소숫점 둘째자리까지만 출력) 
		 * 평균 점수가 90점 이상이면 A, 
		 * 80점 이상 90점 미만이면 B, 
		 * 70점 이상 80점 미만이면 C, 
		 * 60점 이상 70점 미만이면 D, 
		 * 60점 미만이면 F로 계산한다.
		 */
		// 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		System.out.print("프로그래밍 기초: ");
		int class1 = scanner.nextInt();
		System.out.print("데이터베이스: ");
		int class2 = scanner.nextInt();
		System.out.print("화면 구현: ");
		int class3 = scanner.nextInt();
		System.out.print("애플리케이션 구현: ");
		int class4 = scanner.nextInt();
		System.out.print("머신러닝: ");
		int class5 = scanner.nextInt();

		// 평균구해서 출력해주기
		double var1 = class1 + class2 + class3 + class4 + class5;
		int sum = (int) var1;
		double avg = var1 / 5;

		System.out.println("총점 :" + sum);
		System.out.println("평균 :" + avg);
		String grade;
		//String grade;
		// 등급판정해서 출력해주기
		if (avg >= 90) {
			grade = "A";
		} else if (avg >= 80) {
			System.out.println("학점: B");
		} else if (avg >= 70) {
			System.out.println("학점: C");
		} else if (avg >= 60) {
			System.out.println("학점: D");
		} else {
			System.out.println("학점: F");
		}
		/*
		 * 스위치 케이스로 해야한다면 avg에 인트형으로 바꿔주기
		 * 
		 */
	}
}