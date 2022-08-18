package Chapter06;

public class MemberExample {

	public static void main(String[] args) {
		
		Member member3 = new Member();
		member3.name = "이순신";
		
		Member member = new Member();
		member.name = "최하얀";
		System.out.println(member.name);
		member.age = 23;
		System.out.println(member.age);
		
		System.out.println();
		
		Member member2 = new Member();
		member2.name = "홍길동";
		System.out.println(member2.name);
		member2.age = 28;
		System.out.println(member2.age);
	
	}

}
