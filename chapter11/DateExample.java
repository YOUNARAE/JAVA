package chapter11;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
			Date date = new Date();
			System.out.println(date); //2022-09-06 12:29:40
			SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 E요일");
			//SimpleDateFormat : 날짜를 원하는 포맷에 맞게 문자열로 변환
			System.out.println(format.format(date));
			
			Calendar calendar = Calendar.getInstance();
			int year = calendar.get(Calendar.YEAR);
			int month = calendar.get(Calendar.MONTH);
			int day = calendar.get(Calendar.DAY_OF_MONTH);
			System.out.println(year + "년" + month + "월" + day + "일");
			
			LocalDateTime.now(); //now 현재지역시간을 가져온다
			System.out.println(LocalDateTime.now());//자체적으로 포맷을 제공한다
			
			//chaining 방식
			String date2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh시 mm분 ss초 E요일"));
			System.out.println(date2);
	}
}
