package Chapter05;

public class Exercise04 {

	public static void main(String[] args) {
		//최대값을 구하는 문제, 초기값을 가장 작게
		int max = 0;
		int min = Integer.MAX_VALUE; 
		//최소값을 구하는 문제, 초기값을 가장 크게

		
		int[] array = {1, 5, 3, 8, 2};
		//max에 숫자 크기를 비교해서 큰 것보다 작은 건 무시하게 됨
	
		
		
		//작성위치
		for( int i=0; i<array.length; i++ ) {
			if( array[i] > max ) {
				max = array[i];
			}
			if( array[i] < min ) {
				min = array[i];
			}
		} 
		System.out.println("max: "+ max);//최대값을 시작할 때는 가장 작은 수(원소들보다)
		System.out.println("min: "+ min);

	}

}
