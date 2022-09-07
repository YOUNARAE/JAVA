package chapter13;

import java.util.ArrayList;
import java.util.List;

import chapter11.confirm.Member;

public class GenericExample {
	public static void main(String[] args) {
		// Generic  제네릭
		List<String> list = new ArrayList<String>();
//		MemberBox memberBox = new MemberBox(new Member("1","a"));
		
//		StringBox stringBox = new StringBox("홍길동");
//		Box box1 = new Box("홍길동");
//		Box box2 = new Box(100);
//		Box box3 = new Box(new Member("1","a"));
//		if(box1 instanceof String) {
//			String value1 = (String) box1.getValue();
//		}
//		
//		String value1 = (String) box1.getValue();
//		
//		int value2 = (int) box2.getValue();
//		Member value3 = (Member) box3.getValue();
		
		Box<String> box = new Box<>("홍길동"); //Box에 들어가는 타입은 스트링이다고 정해주는 것
		String value = box.getValue();
		
		Box<Member> box2 = new Box<>(new Member("1", "a"));

	}
}
