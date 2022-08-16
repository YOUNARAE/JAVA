package Chapter03;

public class confirm03_2 {

	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = (pencils/students);
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = (pencils%students);
		System.out.println(pencilsLeft);
		
		int value = 356;
		//System.out.println(value / 100*100);
		System.out.println(value - value%100);
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int Height = 7;
		//double area = (lengthTop+lengthBottom) * (double)Height / 2;
		double area = (lengthTop+lengthBottom) * Height / 2.0;
		System.out.println(area);
		
		
	}

}
