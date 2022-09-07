package chapter10;

import java.util.Random;
import java.util.Scanner;

public class UnAndDownWithException {
	public static void main(String[] args) {

		Random random = new Random();
		int ranNum = random.nextInt(100) + 1;
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("1부터 100사이의 정수 숫자 입력: ");
				int num = scanner.nextInt();
				if (ranNum > num) {
					throw new LessNumberException("작은 수를 입력하였습니다");
				} else if (ranNum < num) {
					throw new GreaterNumberException("큰 수를 입력하였습니다");
				} else {
					System.out.println("정답입니다.");
					System.out.println("게임을 종료합니다.");
					break;
				}
			} catch (LessNumberException e) { //LessNumberException | GreaterNumberException e이거는 멀티 캐쳐
				//e.printStackTrace();
				System.out.println(e.getMessage());
			} catch (GreaterNumberException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		scanner.close();
	}
}
