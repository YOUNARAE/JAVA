package chapter05.exercise;

public class Exercise51 {
	public static void main(String[] args) {
       /*다음 배열에서 최댓값과 최솟값을 구하시오.
        * {38, 94, 16, 3, 76, 94, 82, 47, 59, 8}
        */
		
		int max = 0;
		int min = Integer.MAX_VALUE;
		int[] array = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
		
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		System.out.println("max 값은 "+max);
		System.out.println("min 값은 "+min);
	}
}
