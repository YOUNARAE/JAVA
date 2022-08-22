package chapter04;

public class PracticePlus {

	public static void main(String[] args) {
		// 다음의 for문을 while문으로 변경하시오.
		for(int i = 0; i<=10; i++) {
			for(int j=0; j<=i; j++)
				System.out.println("*");
			System.out.println();
		}
	}//end of main
}
