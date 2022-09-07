package chapter05.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise52 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		Random random = new Random();
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[j] == lotto[i]) {
					i--;
				}
			}
		}
		// 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}

	}
}