package chapter04;

import java.util.Scanner;

public class BreakOutterExample_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("생략할 곱하기 : ");
		int dan = scanner.nextInt();
		
		Outter: for ( int i=2; i<9; i++) {
			//System.out.println(i + "단");
			System.out.println();
			for (int j=1; j<=9; j++) {
				if(dan == j) {
					//break Outter;
					continue;
				}
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
	}
}
