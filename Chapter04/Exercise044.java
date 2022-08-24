package chapter04;

import java.util.Scanner;

public class Exercise044 {

	public static void main(String[] args) {
		/*
		 * 두 사람이 하는 가위 바위 보 게임을 만들어 보자. 
		 * 두 사람이 입력한 문자열을 비교하여 누가 이겼는지 출력하는 프로그램이다.
		 * 문자열을 읽기 위해서는 Scanner 클래스의 next() 메소드를 이용하면 된다. 
		 * 또 자바에서 문자열 비교는 주의를 기울여야 한다. 
		 * String 타입 변수와 문자열 비교는 == 이 아닌 equals() 메소드로 비교하여야 한다.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		//가위바위보를 입력한다
		System.out.printf("센 : ");
		String sen= scanner.next();
		System.out.printf("치히로 : ");		
		String chhiro = scanner.next();
		//누가 이겼는지 판별해서 출력한다
		
		String result ="";
		
		if(sen.equals(chhiro)) {
			result = "둘 다 비겼다";
		} else if(sen.equals("바위")&&chhiro.equals("가위")||sen.equals("가위")&&chhiro.equals("보")||sen.equals("보")&&chhiro.equals("바위")) {
			result = "센이 이겼다. 센은 풀려난다";		
		} else {
			result = "치히로가 이겼다";
		}
		System.out.println("결과 : " + result);
	}

}
