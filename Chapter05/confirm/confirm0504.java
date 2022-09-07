package chapter05.confirm;

public class confirm0504 {

	public static void main(String[] args) {
		int max = 0;
		int min = 0;
		int[] array = {1,5,3,8,2};
		
		//작성위치
		for(int i=0;i<array.length;i++) {
			if( array[i] > max ) {
				max = array[i];
			} 
		}
		//
		System.out.println("max : "+max);

	}

}
