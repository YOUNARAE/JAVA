package chapter11;

import java.util.Objects;

//VO(Value Object) : 데이터를 저장하는 객체
//DTO(Data Transger Object) : 데이터를 전달하는 객체
//Bean => 자바 커피 원두(bean) => 데이터를 저장하는 객체를 표현
//Item, Model 등과 같은 접미사를 붙이기도 함
//Lombok
//@Data 
//@Cibstructor
//@Getter
//@Setter
//Kotlin 언어 : jetBrain (intellij를 만든 회사)
public class Member {
	private String name;
	private int id;
	
	public Member(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Member))
			return false;
		Member other = (Member) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		// apache 재단 => 라이브러리 commons 접두어가 붙은 라이브러리
		return String.format("Memeber [name=%s, id=%s]", name, id);
	}
	
	public static void main(String[] args) {
		//1,662,348,749.690
		System.out.println(System.currentTimeMillis());
	}
	
	
	
}
