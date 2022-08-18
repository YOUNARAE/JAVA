package Chapter05;

import java.util.Random;

public class Exercise52 {

	public static void main(String[] args) {
		/*
		 * 로또번호를 생성하는 프로그램을 작성하시오.
		 * (로또 번호는 1 ~ 45번까지 있으며 
		 * 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)
		 */
		while(true) {
			
			Random random = new Random();
			
			int num1 = random.nextInt(45)+1;
			int num2 = random.nextInt(45)+1;
			int num3 = random.nextInt(45)+1;
			int num4 = random.nextInt(45)+1;
			int num5 = random.nextInt(45)+1;
			int num6 = random.nextInt(45)+1;
			
			//6개의 숫자는 서로 중복되면 안된다
			//num1일 때 2,3,4,5,6이랑 같으면 안됨
			if((num1 != num2)&&(num1 !=num3)&&(num1 != num4)&&(num1 != num5)&&(num1 != num6)){
				
				if((num2 != num3)&&(num2!=num4)&&(num2!=num5)&&(num2!=num6)) {
				
					if((num3!=num4)&&(num3!=num5)&&(num3!=num6)) {
					
						if((num4!=num5)&&(num4!=num6)) {
							
							if(num5!=num6) {
						
								System.out.println("("+num1+","+num2+","+num3+","+num4+","+num5+","+num6+")");
								break;
							}
						}
					}
				}
			}
			//if문 끝남
		}
	}
}
