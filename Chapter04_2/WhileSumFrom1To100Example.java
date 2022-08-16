package Chapter04_2;

public class WhileSumFrom1To100Example {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 1;
		
		while( i <= 100 ) {
			sum += i;
			i++;
		}
		//출력 
		System.out.println("1~" + (i-1) + " 합 : " + sum);//마지막에 101이 되기때문에 -1을 빼준다
	}
}
