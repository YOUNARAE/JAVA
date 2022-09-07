package chapter04;

import java.util.Scanner;

public class Exercise44{
	public static void main(String[] args){
		
		System.out.println("가위 바위 보 게임");
		Scanner scanner = new Scanner(System.in);
		System.out.print("철수 : ");
		String cheolsu = scanner.nextLine();
		System.out.print("영희 : ");
		String younghi = scanner.nextLine();
		
		String result = "";


		if(cheolsu.equals(younghi)){
			result = "둘 다 비겼다";
		} else if(cheolsu.equals("가위")&&younghi.equals("보")||
		          cheolsu.equals("바위")&&younghi.equals("가위")||
		          cheolsu.equals("보")&&younghi.equals("바위")){
			result = "철수 승리!";
		} else {
			result = "영희 승리!";
		}
		System.out.println("결과 : "+result);
	}
}

