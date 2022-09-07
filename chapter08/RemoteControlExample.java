package chapter08;

public class RemoteControlExample {
	public static void main(String[] args) {
		//다형성과 연관, 개발코드부분
		RemoteControl control = new Television(); //
		
		//Searchable searchable = (Searchable) control;
		//searchable.search("홍길동"); 
		
		//Television television = new Television();
		//television.search("홍길동");
		
		control.turnOn();
		control.setVolume(5);
		
		control = new Audio();
		control.turnOn();
		control.setVolume(5);
		
		Television tv = new Television();
		RemoteControl control2 = tv;
		Searchable searchable = tv;
		control2.turnOn();
		control2.setVolume(7);
		searchable.search("홍길동");
	}
}
