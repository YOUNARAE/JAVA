package chapter04_2;

import java.util.Random;

public class confirm05_03 {

	public static void main(String[] args) {
		
		while(true) {
			Random random = new Random();
			int num1 = random.nextInt(6) + 1;
			int num2 = random.nextInt(6) + 1;
			 
			if(num1+num2==5) {
					break;
			}//if문 한개만 쓴다
			System.out.println("(" + num1 + ") , (" + num2 + ")");
		}
	}
}
