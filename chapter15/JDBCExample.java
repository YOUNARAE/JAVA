package chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {
	public static void main(String[] args) throws Exception {
		// 0. 드라이버 로딩(리플렉션기법 사용)
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		// 1. DB 접속(서버 주소, 아이디, 패스워드) 127.0.0.1
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "WDH94", "java");
		
		// 2. 연결된 DB에 요청할 쿼리 작성
		Statement statement = connection.createStatement();
		String sql = "";
		sql += " SELECT";
		sql += "     mem_id,";
		sql += "     mem_name,";
		sql += "     mem_hp,";
		sql += "     mem_mail";
		sql += " FROM";
		sql += "     member";
		
		// 3. 쿼리 실행
		//executeQuery : select 조회 => 결과집합(ResultSet)을 반환
		//executeUpdate : insert, update, delete 수정/업데이트 =>실행된 갯수 반환
		ResultSet resultSet = statement.executeQuery(sql);
				
		// 4. 실행 결과 받기
		while (resultSet.next()) {
			String memId = resultSet.getString("mem_id");
			String memName = resultSet.getString("mem_name");
			String memHp = resultSet.getString("mem_hp");
			String memMail = resultSet.getString("mem_mail");
			System.out.printf("%s \t %s \t %s \t %s\n", memId, memName, memHp, memMail);
		}
		// 5. 접속 종료(자원반납)
		resultSet.close();
		statement.close();
		connection.close();
	
	}
}
