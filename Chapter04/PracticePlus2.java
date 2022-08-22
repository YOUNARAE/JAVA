package chapter04;

public class PracticePlus2 {

	public static void main(String[] args) {
		//구구단의 일부분을 다음과 같이 출력하는 프로그램을 작성하시오.
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=3;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
	}
}
