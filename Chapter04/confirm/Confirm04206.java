package chapter04.confirm;

public class Confirm04206 {

	public static void main(String[] args) {
		
		/* for문을 이용해 다음과 같이 *를 출력하는 코드를 작성하세요
		 * ****
		 * ***
		 * **
		 * *

		for(int i=0;i<=4;i++) {
			System.out.println(" ");
			for(int k=4;k>i;k--) {
				System.out.printf("*");
			}
		} */
		
		
		/*
		 * ****
		 *  ***
		 *   **
		 *    *
		 */
		//줄이 1개씩 늘어나서 4개까지 생긴다.
		//1줄이 도는 동안 1개씩만 증가한다.
		for(int i=1;i<5;i++) {
			for(int k=4;k>0;k--) {
				if(k>i) {
					System.out.print(" ");
				} else {
				System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
}
