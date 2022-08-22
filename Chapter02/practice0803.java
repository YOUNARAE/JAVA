package chapter02;

import java.util.Scanner;

public class practice0803 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름:");
		String inputName = scanner.nextLine();
		
		System.out.println("2. 주민번호 앞 6자리:");
		String inputNum = scanner.nextLine();
		
		System.out.println("3. 전화번호:");
		String inputPhone = scanner.nextLine();
		
		System.out.println("[입력한 내용]");
		System.out.println("이름: "+inputName);
		System.out.println("주민번호 앞 6자리: "+inputNum);
		System.out.println("전화번호: "+inputPhone);
	}
}


