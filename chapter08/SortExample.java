package chapter08;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		String[] names = {
				"박형준", "이찬영", "김서빈", "민경진", "허근주",	
				"유나래", "박시윤", "최경수", "위대현", "송지은",	
				"임채리", "김경하", "장예지", "이수현", "양서연",	
				"이한들", "서범수", "이현주", "장은호", "이선민",	
				"전혜수", "박인수", "윤호연", "박인성", "김준일",	
		};
		Arrays.sort(names); //문자열을 오름차순으로 정렬

		int[] ages = {
				63, 77, 58, 85, 32,
				91, 14, 45, 93, 13,
				29, 49, 95, 44, 90,
				95, 80, 37, 50, 6,
				17, 53, 38, 60, 4
		};
		Arrays.sort(ages); //숫자가 오름차순으로 정렬
		
		Student[] students = {
			new Student("박형준", 63),
			new Student("이찬영", 77),
			new Student("김서빈", 58),
			new Student("민경진", 85),
			new Student("허근주", 32),
			new Student("유나래", 91),
			new Student("박시윤", 14),
			new Student("최경수", 45),
			new Student("위대현", 93),
			new Student("송지은", 13),
			new Student("임채리", 29),
			new Student("김경하", 49),
			new Student("장예지", 95),
			new Student("이수현", 44),
			new Student("양서연", 90),
			new Student("이한들", 95),
			new Student("서범수", 80),
			new Student("이현주", 37),
			new Student("장은호", 50),
			new Student("이선민", 6),
			new Student("전혜수", 17),
			new Student("박인수", 53),
			new Student("윤호연", 38),
			new Student("박인성", 60),
			new Student("김준일", 4),
		};
		Arrays.sort(students);
		for (Student student : students) {
			System.out.println(student);
		}
	}
}