package chapter04;

import java.util.Scanner;

public class Exercise42 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 특정 월을 입력받은 후, 
		 * 입력 받은 월의 계절이 어떤 계절인지 알아내는 프로그램을 만들어 보자. 
		 * 3월~5월은 봄, 6월~8월은 여름, 9월~11월은 가을, 12월~2월은 겨울을 출력한다.
		 * 실행 결과는 3번 반복되어 있지만 1번만 나오도록 작성하시면 됩니다.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("월을 입력하세요(1~12): ");
		int month = Integer.parseInt(scanner.nextLine());

		switch (month) {
		case 1:
			System.out.println("1월은 겨울입니다");
			break;
		case 2:
			System.out.println("2월은 겨울입니다");
			break;
		case 3:
			System.out.println("3월은 봄입니다");
			break;
		case 4:
			System.out.println("4월은 봄입니다");
			break;
		case 5:
			System.out.println("5월은 봄입니다");
			break;
		case 6:
			System.out.println("6월은 여름입니다");
			break;
		case 7:
			System.out.println("7월은 여름입니다");
			break;
		case 8:
			System.out.println("8월은 여름입니다");
			break;
		case 9:
			System.out.println("9월은 가을입니다");
			break;
		case 10:
			System.out.println("10월은 가을입니다");
			break;
		case 11:
			System.out.println("11월은 가을입니다");
			break;
		case 12:
			System.out.println("12월은 겨울입니다");
			break;
		default:
			System.out.println("잘못된 입력입니다");
		}
//   		/*if문사용*/
		/*
		 * int month = scanner.nextLine(); String season = ""; if(month>=3 && month <=5)
		 * { season = "봄"; } else if (month>=6 && month <=8) { season = "여름"; } else if
		 * (month>=9 && month <=11){ season = "가을"; } else if (month==12 || month <=2){
		 * season = "겨울"; } else { season = "알수 없는 계절"; }
		 */
	}
}
