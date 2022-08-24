package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		 System.out.print("가위 바위 보를 입력하세요: ");
		 String player = scanner.nextLine();
		 Random random = new Random();	
		 int ranNum = random.nextInt(3); //0부터 2까지의 랜덤한 수
		
		 String[] comArr = {"가위","바위","보"};
		 String computer = comArr[ranNum];

		 
		 String result = "";
		 
		 if(player.equals(computer)) {
			 result = "사귄다";
		 } else if(player.equals("가위") && computer.equals("바위")
		 || player.equals("바위") && computer.equals("보")
		 || player.equals("보") && computer.equals("가위")) {
		 result = "넌 시리에게 졌어";
		 } else {
		 result = "게이머 승리!";
		  } System.out.println("결과: " + result);
	}
}

