package chapter11.confirm;

import java.util.HashMap;
import java.util.Map;

public class StudentExample {
	public static void main(String[] args) {
//		Map<Student, String> map = new Map<Student, String>;
//		map.put("1", "95"); //0x1234
		
//		String score = map.get(new Student("1"));//0x1235
		//Student 키로 총점을 저장하는 HashMap 객체 생성
		HashMap<Student, String> hashMap = new HashMap<Student, String>();
		//new Student("1)의 점수 95를 저장
		hashMap.put(new Student("1"), "95");
		
		//new Student("1")fh 점수를 읽어옴
		String score = hashMap.get(new Student("1"));
		System.out.println("1번 학생의 총점 : "+score);
	}
}
