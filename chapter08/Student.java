package chapter08;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return String.format("Student [name=%s, age=%s]", name, age);
	}
	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name); //이름을 오름차순으로 정렬해주는 compareTo
//		return -this.name.compareTo(o.name); 내림차순정렬
	}
//		if (this.age > o.age) {
//			return -1;
//		} else if (this.age < o.age) {
//			return 1;
//		}
//		return 0;
//		
//	}
		
	
}