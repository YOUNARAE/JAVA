package chapter08.Exercise;

import java.util.Objects;

public abstract class Book {
	//필드
	private int number; //관리번호
	private String title; //책의 제목
	private String author; //책의 저자
	private static int countOfBooks; //만들어진 Book 객체 개수, 선언과 동시에 0으로 초기화
	
	//생성자
	public Book(String title, String author) {
		countOfBooks++; //countOfBooks를 1만큼 증가시킨다
		this.title = title;
		this.author = author;
		this.number = countOfBooks;// 관리번호 필드에 현재 countOfBooks 값으로 한 뒤 
	}
	
	//메소드
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
//	public boolean equals(Object obj) {
//		Book book = (Book)obj;
//		if(title.equals(book.title)&&author.equals(book.author)) {
//			return true;
//		}
//		return false;
//		
//	}
	
	
	
//	 public boolean equals(Book o) { //어떤 객체가 어떤 것과 같은 지 확인하기 위한 용도로 나온 equals
//	  if(title.equals(o.title)&&author.equals(o.author)) { 
//		  return true; 
//	  } else {
//		  return false; 
//		  } 
//	  }
	/*
	 * public int hashCode() { return Objects.hash(o); }
	 */
	//추상메소드
	public abstract int getLateFee(int lateDays);

	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
	    //Object와 관련된 유틸리티 메서드
	}

	public String toString() {
		return String.format("관리번호: %d번, 제목: %s, 작가: %s(일주일 연체료: %d 원)",number, title, author, getLateFee(7));
	}
	

}
