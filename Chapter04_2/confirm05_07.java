package Chapter04_2;

import java.util.Scanner;

public class confirm05_07 {

	public static void main(String[] args) {
		boolean run = true;//반복문 반복 여부
		int balance = 0;// 잔액
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4.종료");
			System.out.println("--------------------------------------");
			System.out.printf("선택>");
//			int num = scanner.nextInt();

			int num = Integer.parseInt(scanner.nextLine());//스캐너는 nextLine이나 int로 통일해서 받아야 버그가 나지 않는다.
			// if, switch문 중에서 선택
			
			switch(num) {
			case 1:
				System.out.print("예금액 >");
				balance += Integer.parseInt(scanner.nextLine());
				break;
			
			case 2:
				System.out.print("출금액 >");
				balance -= Integer.parseInt(scanner.nextLine());
				break;
			
			case 3:
				System.out.println("잔고 >" + balance);
				break;
				
			case 4:
				run = false;
				break;
				
			default :
				System.out.println("잘못된 메뉴를 입력했습니다");
			}
		}
		System.out.println("프로그램 종료");

			// if문 사용
/*			if (num == 1) {
				System.out.print("예금액 >");
				int result = scanner.nextInt();
				balance += result;
			} else if (num == 2) {
				System.out.print("출금액 >");
				int result = scanner.nextInt();
				balance -= result;
			} else if (num == 3) {
				System.out.println("잔고 >" + balance);
			} else {
				run = false;
				System.out.println();
				break;
			}
		}
		System.out.println("프로그램 종료");*/
	}
}
