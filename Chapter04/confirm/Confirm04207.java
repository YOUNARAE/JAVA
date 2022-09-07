package chapter04.confirm;

import java.util.Scanner;

public class Confirm04207 {
	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int amount = 0;
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택 > ");
			int num = scanner.nextInt();
			
			if(num==1) {
				System.out.print("예금액 > ");
				balance = scanner.nextInt();
			} 
			if(num==2) {
				System.out.print("출금액 > ");
				amount = scanner.nextInt();
				if(amount>balance) {
					System.out.println("잔고가 모자랍니다. 프로그램을 강제종료합니다");
					System.exit(num);
					break;
				}
			}
			if(num==3) {
				System.out.println("잔고 > "+(balance-amount));
			}
			if(num==4) {
				System.out.println("프로그램 종료");
			}
		}
		/*
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
		System.out.println("프로그램 종료");*/

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
