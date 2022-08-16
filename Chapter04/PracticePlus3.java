package Chapter04;

public class PracticePlus3 {

	public static void main(String[] args) {
		/*
		 * 1 + (1 + 2) + (1 + 2 + 3) + (1 + 2 + 3 + 4) + ... + (1 + 2 + 3 + ... + 10)의
		 * 결과를 계산하는 프로그램을 작성하시오. 실행 결과: 220
		 */
		int i = 1;
		int sum = 0; //그냥 1 담는 그릇
		int totalSum = 0; // 계속 더해지는 거 담는 그릇
		
		for(i=1;i<=10;i++) {
			sum += i;
			
		}
	}
}
