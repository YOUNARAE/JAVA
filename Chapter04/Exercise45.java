package chapter04;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 {

	public static void main(String[] args) {
		/*
		 컴퓨터가 1부터 100 사이의 임의의 정수를 생성하면, 그 수를 맞추는 게임을 만들어보자. 
		 사용자가 추측한 수를 입력하면, 컴퓨터가 생성한 수보다 큰지 작은지를 알려준다. 
		 사용자가 추측한 수가 컴퓨터가 생성한 수와 같을 때까지 반복한다.
		 1부터 100까지의 랜덤 숫자는 new Random().nextInt(100) + 1로 구할 수 있다.
		 */
		//이진탐색방법 최대 7번이면 탐색이 가능하다
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int i = new Random().nextInt(100) + 1;
		
		while(true) {
			System.out.print("1부터 100사이의 정수 중 하나를 선택하세요: ");
			int num = scanner.nextInt();
			
			if(num<i) {	
				System.out.println("정답은 더 큰 수입니다");
			} else if(num>i) {
				System.out.println("정답은 더 작은 수입니다");
			} else if(num==i) {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다");
				break;
			}
		}
	}
}
