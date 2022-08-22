package chapter04;

import java.util.Random;

public class SwithchExample {

	public static void main(String[] args) {
		Random random = new Random();
		int num = random.nextInt(6) + 1;
		
		switch (num) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
		case 6:
			System.out.println("6");
		default:
			System.out.println("그 밖의 숫자");
			break;
		}
	}
}
