package chapter07.Exercise;

public class Student extends Human {
	//필드
	String major;
	
	
	//생성자
	public Student(String name, int age, String major) {
		super(name,age);
		this.major = major;
	}
	
	//메소드
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return String.format(super.toString()+", 전공 : "+ major);
	}
}
