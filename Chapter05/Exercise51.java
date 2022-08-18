package Chapter05;

public class Exercise51 {

	public static void main(String[] args) {
	/*
	7 * 다음 배열에서 최댓값과 최솟값을 구하시오.
	8 * {38, 94, 16, 3, 76, 94, 82, 47, 59, 8}
	9 */
	int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};

//			int max = Integer.MIN_VALUE;
//			int min = Integer.MAX_VALUE;
	
	int max = array[0];
	int min = array[0];
	
	
	for(int i=0;i<array.length;i++) {
		//최대값
		if(array[i]>max) {
			max = array[i];
		}
		//최소값
		if(array[i]<min) {
			min = array[i];
		}
	 }
	 System.out.println("최대값 : "+max);
	 System.out.println("최소값 : "+min);
	}	
}

