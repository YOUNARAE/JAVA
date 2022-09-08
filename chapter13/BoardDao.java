package chapter13;

import java.util.ArrayList;
import java.util.List;

//Data Access Object --데이터를 가져와서 저장하는 객체
public class BoardDao {
	public List<Board> getBoardList() {
		List<Board> list = new ArrayList<>();
		
		list.add(new Board("제목1","내용1"));
		list.add(new Board("제목2","내용2"));
		list.add(new Board("제목3","내용3"));
		
		return list;
		
	}
}
