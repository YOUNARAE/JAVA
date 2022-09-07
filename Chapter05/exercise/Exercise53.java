package chapter05.exercise;

import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		/*
		 * 인공지능 컴퓨터와 게이머(사람)가 
		 * 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
		 */
		System.out.print("가위 바위 보를 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		String human = scanner.nextLine();
		String[] aiArray = {"가위","바위","보"};
		Random random = new Random();
		int num = random.nextInt(3);//0,1,2
		String result = "";
		
		if(human.equals(aiArray[num])) {
			result = "둘 다 비겼음";
		} else if(human.equals("가위")&&aiArray[num].equals("보")||
				human.equals("바위")&&aiArray[num].equals("가위")||
				human.equals("보")&&aiArray[num].equals("바위")) {
			result = "인공지능은 인간을 이길 수 없다";
		} else {
			result = "인공지능 세상!";
		}
		System.out.println("게이머 : "+human);
		System.out.println("인공지능 컴퓨터 : "+aiArray[num]);
		System.out.println("결과 : "+result);
	}
}
