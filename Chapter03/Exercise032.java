package chapter03;

import java.util.Scanner;

public class Exercise032 {

	public static void main(String[] args) {
		/*
		 * 메트로폴리스(거대도시)는 다음과 같은 2가지 조건 중 하나를 만족하여야 한다고 가정한다.
		 *  어떤 도시가 메트로폴리스인지를 알아보는 프로그램을 작성하여 보자.(삼항연산자 사용)
			1. 한 나라의 수도이고, 인구가 100만 이상이어야 한다. 
			2. 연 소득이 1억 이상인 인구가 50만 이상이어야 한다.
		 
		//입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("수도입니까? (수도:1, 수도아님 :0) ");
		int capital = scanner.nextInt();
		System.out.print("총 인구는? (단위 : 만) ");
		int popular = scanner.nextInt();
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만) ");
		int salary = scanner.nextInt();
		
		//판단하기 삼항연산자 사용하기 
		//or로 엮기
		
		String result = ((capital==1 && popular>=100)||(salary>=50) ? "이 도시는 수도입니다" : "이 도시는 수도가 아닙니다" );
		System.out.println(result);
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("수도입니까? (수도:1, 수도아님 :0) ");
		int capital = scanner.nextInt();
		System.out.print("총 인구는? (단위 : 만) ");
		int popular = scanner.nextInt();
		System.out.print("연소득이 1억 이상인 인구는?(단위: 만) ");
		int salary = scanner.nextInt();
		
		/*if(capital==1&&popular>=100) {
            System.out.println("이 도시는 수도입니다");
		} else if(salary>=50) {
			System.out.println("이 도시는 수도입니다");
		} else {
			System.out.println("이 도시는 수도가 아닙니다");
		}*/
		
		if(capital==1&&popular>=100||salary>=50) {
			System.out.println("이 도시는 수도입니다");
		} else {
			System.out.println("이 도시는 수도가 아닙니다");
		}
	}
}
