package chapter10;

import java.util.Scanner;

import chapter08.Student;

public class ExceptionExample {
	public static void main(String[] args) {
		//1.일반예외
		try {
			Class.forName("java.Iang.String");
		} catch (ClassNotFoundException e) {//e클래스를 못찾는다고 에러가뜬다.
			// 괄호에 있는 타입을 캐치해서 중괄호 안에 있는 것을 출력해준다.오류라는 것을 알려준다.
			//어떤 에러인지는 e 변수에 저장해놓는다
			//e.printStackTrace();
			System.out.println("입력하신 클래스가 존재하지 않습니다.");
		}
		//작성을 완벽하게 한 것 같은데 에러가 나오는 것
		
		
		try (Scanner scanner = new Scanner(System.in)) {
			int nextInt = scanner.nextInt();
			System.out.println(nextInt);
			scanner.close();
		} //try catch보다 리소스를 하면 파이널을 안해도 위에꺼가 오류나서 실행이 안되도
		  //밑에 나와야하거나 실행되야할 코드들이 실행이 되서 파이널을 쓰는 경우보다 깔끔해보인다
		
		
		//2.실행 예외
		try {
			//Student student = new Student("홍길동", 10);
			Student student = null; //null포인트에서 오류가 난다.
			student.compareTo(new Student("홍길동", 10)); //Alt+Shift+z 누르기
			int[] numbers = {1, 2, 3};
			System.out.println(numbers[5]);
		} catch (NullPointerException e) { //에러 예시 추가
			System.out.println("Null 참조 에러 발생");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 에러");
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("알 수 없는 예외가 발생했습니다.");
			//상위예외클래스가 밑으로 내려가야한다.
		} finally {
			System.out.println("반드시 출력해야 할 문자");
		}//finally에 넣으면 무조건 출력이 될 수 있다
		
	}
}
