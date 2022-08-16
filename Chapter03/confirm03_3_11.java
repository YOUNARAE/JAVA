package Chapter03;

import java.util.Scanner;

public class confirm03_3_11 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디:");
		String name = scanner.nextLine();
		
		System.out.print("패스워드:");
		String strPassword = scanner.nextLine();
		int password = Integer.parseInt(strPassword);
		/* 곱하기 연산
		 * 3 * 4 
		 * 
		 * "3" * "4"
		 * "3".multiply("4");
		 * 
		 */
		//if(name.equals("java")) {
		if("java".equals(name)) {
			if (password==12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인실패 : 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패 : 아이디 존재하지 않음");
		}

	}

}
