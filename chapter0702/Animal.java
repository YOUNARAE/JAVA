package chapter0702;

public abstract class Animal {
	public String kind;
	
	public void breath() {
		System.out.println("숨을 쉰다");
	}
	public abstract void sound(); //abstract를 붙이면 추상 메소드가 된다.
}
