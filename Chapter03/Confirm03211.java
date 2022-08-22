package chapter03;

import java.util.Scanner;

public class Confirm03211 {

	public static void main(String[] args) {
		
		System.out.print("아이디 :");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		
		System.out.print("패스워드 :");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password==12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("아이디가 존재하지 않음");			
		}
	}
}
