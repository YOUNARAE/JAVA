package chapter04;

public class PracticePlus1 {

	public static void main(String[] args) {
		
		//1. int x >= 10 && int x <= 20
		//2. char ch != " " || char ch != "\t" 
		//3. char ch = 'x' || char ch = 'X'
		//4. char ch = 0+ch; ch>10; ch++;
		//5. char ch = "
		//6. if((int year%400==0)&&(int year%400==0)||(int year%100!=0))
		//7. boolean powerOn != false
		//8. String str = "yes"
				
		
	  /* 1부터 20까지의 정수 중에서 
	   * 2또는 3의 배수가 아닌 수의 총 합을 구하는 프로그램을 작성하시오 
	   */
		/*
		 * int sum = 0; int i = 1;
		 * 
		 * while(i<=20) { if((i%2!=0)||(i%3!=0)) { i += sum; i++; } }
		 * System.out.println(sum);
		 */
		int sum1 = 0;
		int sum2 = 0;
		//1,5,7,11,13,17,19
	    int sum = 1+5+7+11+13+17+19;
	    System.out.println(sum);
		   for(int i =1;i<=20;i++) {
				if(i%2!=0&&i%3!=0) {
					sum1 = sum1 +i;
					i++;
				}
			}
			System.out.println(sum1+sum2);
		 }
	}
