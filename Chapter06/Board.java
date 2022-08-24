package Chapter06;

public class Board {

		private String title;
		private String content;
		private String writer;
		private String date;
		private int hitcount;

		//Telescoping Constructor Pattern
		
		Board(String title, String content){
			this(title,content,"로그인한 회원아아이디","현재 컴퓨터 날짜",0);
		}
		
		Board(String title, String content, String writer){
			this(title,content,writer,"현재 컴퓨터 날짜",0);
		}
		
		Board(String title, String content, String writer, String date){
			this(title,content,writer,date,0);
		}
		
		Board(String title, String content, String writer, String date, int hitcount){
			this.title = title;
			this.content = content;
			this.writer = writer;
			this.date = date;
			this.hitcount = hitcount;
		}
	
		public String getTitle(){
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		} //setter
		
		public String getContent() {
			return content;
		}
		
		public void setContent(String content) {
			this.content = content;
		} //setter
		
		public String getWriter() {
			return writer;
		} //getter
		
		public void setWriter() {
			this.writer = writer;
		}
		
		public String getDate() {
			return date;
		}
		
		public void setDate() {
			this.date = date;
		}
		
		public int getHitcount() {
			return hitcount;
		}//getter
		
		public void setHitcount() {
			this.hitcount = hitcount;
		}	
		
	}
