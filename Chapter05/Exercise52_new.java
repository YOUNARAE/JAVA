package chapter05;

import java.util.Iterator;
import java.util.Random;

public class Exercise52_new {

	public static void main(String[] args) {
		/*
		 * 로또번호를 생성하는 프로그램을 작성하시오.
		 * (로또 번호는 1 ~ 45번까지 있으며 
		 * 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)
		 */
		int[] lotto = new int[6];
		Random random = new Random();
		
		//첫번째 방법
/*		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
			//중복된 데이터를 삭제해준다
			for(int j =0; j<i; j++) {
				if(lotto[j]==lotto[i]) {
					i--;
				}
			}
		} */
		//두번째 방법
		int[] balls = new int[45]; //45번 반복문을 돌린다
		
		for(int i = 1; i<balls.length; i++) {
			balls[i] = i+1; //1부터 45까지 들어가게끔
			
		}
		for(int i=0; i<balls.length; i++) {
			int ranNum = random.nextInt(45);
			 
			//데이터 그릇들
			int temp = balls[i];
			balls[i] = balls[ranNum];
			balls[random.nextInt(45)] = temp; 
			
		}	
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = balls[i];
		}
		
		//출력
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
	}

}
