package chapter04.Exercise;

import java.util.Scanner;

public class Exercise42 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 특정 월을 입력받은 후, 
		 * 입력 받은 월의 계절이 어떤 계절인지 알아내는 프로그램을 만들어 보자. 
		 * 3월~5월은 봄, 6월~8월은 여름, 9월~11월은 가을, 12월~2월은 겨울을 출력한다.
		 */
		System.out.print("월을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		String month = scanner.next();
		//int month = scanner.nextInt();
		String season = "";
		
		/*if(month >= 3 && month <=5) {
			season = "봄";
		} else if(month >= 6 && month <=8) {
			season = "여름";
		} else if(month >= 9 && month <=11) {
			season = "가을";
		} else if(month >= 12 || month <=2) {
			season = "겨울";
		} else {
			season = "알 수 없는 계절";
		}
		System.out.println(month+"월은 "+season+"입니다");
		*/
		switch(month) {
			
			case "1":
			case "2":
			case "12":
				season = "겨울";
				break;
		
			case "3":
			case "4":
			case "5":
				season = "봄";
				break;
				
			case "6":
			case "7":
			case "8":
				season = "여름";
				break;
				
			case "9":
			case "10":
			case "11":
				season = "가을";
				break;	
				
			default:
				season = "알 수 없는 계절";
				break;
			}
			System.out.println(month+"월은 "+season+"입니다.");
	}
}
