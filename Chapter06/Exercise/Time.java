package Chapter06.Exercise;

public class Time {
	// 필드
	private int hour;
	private int minute;
	private int second;

	// 생성자
	public Time() {
	}

	public Time(int hour, int minute, int second) {
		//setTime(hour,minute,second);
		//저장할 때 범위에 벗어난 값은 저장하지 않게 한다.
		//유효한 값이 들어오면 저장하고 아니면 초기화 0;
		if(0 > hour || hour < 24) {
			this.hour = hour;
		}
		if(0 > minute || minute < 60 ) {
			this.minute = minute;
		}
		if(0 > second || second < 60 ) {
			this.second = second;
		}
	}
	
	public String toString() {
		//프린트로 직접 출력해주는 것 System.out.print();
		//문자열로 전달하고 싶을 때는 String을 쓴다
		return String.format("%02d:%02d:%02d",hour,minute,second);
		//%02d는 두 자리일 때 여분(패딩)을 0으로 넣어준다는 뜻
	}
}
	
	
