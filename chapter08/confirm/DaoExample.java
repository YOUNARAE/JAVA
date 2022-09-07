package chapter08.confirm;

public class DaoExample {

	public static void main(String[] args) {
		DataAccessObject dao = new OracleDao();
		dbWork(dao);
		
		dao = new MySqlDao();
		dbWork(dao);
	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
}
