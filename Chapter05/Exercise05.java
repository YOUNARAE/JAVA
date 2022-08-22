package chapter05;

public class Exercise05 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int count = 0; // sum을 실행할 때마다 숫자를 세주는 변수
		
		for(int i=0;i<array.length;i++) {//3
			for(int j=0; j<array[i].length;j++) {//array의 i번째 데이터
				sum += array[i][j];//sum에 누적을 시켜준다.
				count++;
			} 
			avg = (double)sum / count;
		}
		System.out.println("sum : "+sum);
		System.out.println("avg : "+avg);
	}
}
