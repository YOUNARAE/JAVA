package chapter11;

import java.util.Iterator;

public class WrapperExample {
	public static void main(String[] args) {
		
		int a = 10;
//		Integer b = new Integer(100);
		Integer b = 100; //autoboxing
		
		int d = b;//auto Unboxing
		
//		String c = new String("홍길동");
		String c = "홍길동";
		
		//1무터 100까지의 합을 구하는 프로그램
		long startTime = System.nanoTime();
		Integer sum = 0;
		//int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += i;
		}
		System.out.println("합계: "+sum);
		long endTime = System.nanoTime();
		System.out.println("걸린 시간: "+(endTime - startTime));
	}
}
