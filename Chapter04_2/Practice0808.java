package chapter04_2;

public class Practice0808 {

	public static void main(String[] args) {
//		int sum = 0;
//		for (int i=1; i<=100; i++) {
//			sum = sum + i;
//		}
//		System.out.println("1~100의 합 : "+sum);
		
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);

		
//		int sum = 0;
//		
//		int i = 0;
//		for(i=1;i<=100;i++) {
//			sum += i;
//		}		
//		System.out.println("1~"+(i-1)+" 합 : "+sum);

		
//		for (int m=2; m<=9; m++) {
//			System.out.println("***" + m + "단***");
//			for (int n=1; n<=9; n++) {
//				System.out.println(m +" x "+ n + " = " + (m*n));
//			}
//		}
		
//		Outter : for(char upper = 'A'; upper<='Z'; upper++) {
//			for(char lower = 'a'; lower<='z'; lower++) {
//				System.out.println(upper + "-" + lower);
//				if(lower=='g') {
//					break Outter;
//				}
//			}
//		}
//		System.out.println("프로그램 실행 종료");
		
		int sum = 0;
		int i = 1;
		for (;i<=100; i++) {
			if ( i % 3 == 0 ) {
			sum += i;
			}		
		}
		System.out.println("3의 배수의 총 합은 "+ sum);
	}
}
