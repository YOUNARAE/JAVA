package Chapter06;

public class PersonExample {
	public static void main(String[] args) {
		
		Person p1 = new Person("123435-1234567", "홍길동");
		
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";
		//p1.ssn = "6542321-7684321";
		p1.name = "홍삼원";
	}

}
