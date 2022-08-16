package Chapter05;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {
		int[] scores =  { 83, 90, 87 };
		int sum= 0;
		/*
		 * for(int i = 0; i < scores.length; i++) { sum += scores[i]; }
		 */
		for(int i =0; i< scores.length; i++) {
			if(i%2==0) {
				sum += scores[i] +1;
			} else {
				sum += scores[i] -1;
			}
		}
		//향상된 for문 foreach, 배열이 오른쪽으로 들어옴
		//for (int score : scores) { //인덱스에 있는 값을 하나씩 꺼내와서 i에 담아준다
			//sum += score;
		//}
		System.out.println("총합 : "+sum);
		
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합 : "+sum2);

	}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return sum;		
	}

}
