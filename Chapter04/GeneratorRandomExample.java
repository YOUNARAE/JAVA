package chapter04;

import java.util.Random;

public class GeneratorRandomExample {

	public static void main(String[] args) {
		
		/* 
		 * 랜덤(Random)=> 난수
		 * 컴퓨터 랜덤 : 가짜 랜덤(pseudo random)
		 * 난수표
		 * Math.random(); => 0.0부터 1.0미만의 double타입의 실수를 반환
		 * Randome 이라고 하는 클래스(객체)를 사용
		 */
		//공식 (int)(Math.random() * 10) + 0; - 밑에 처럼 메소드 불러서
		//Random random = new Random();
		//random.nextInt(10); //0~9까지
		//이걸 이용해서 풀기
		//random.nextInt(10) + 1; 1부터 11까지;
		//random.nextInt(6) + 1; 갯수와 시작하는 숫자 );
		
		Random random = new Random();//LongSeed Seed가 정해지면 같은 답이 나올 수 있다.
		int num1 = random.nextInt(6);
		int num2 = random.nextInt(6);
		int num3 = random.nextInt(6);
		int num4 = random.nextInt(6);
		int num5 = random.nextInt(6);
		int num6 = random.nextInt(6);
		int num7 = random.nextInt(6);
		int num8 = random.nextInt(6);
		//보안 강화 랜덤 SecureRandom
		
		//System.out.println(num1);
		//System.out.println(num2);
		System.out.printf("%d %d %d %d %d %d %d %d", num1, num2, num3, num4, num5, num6, num7, num8); 
		
	}
}
