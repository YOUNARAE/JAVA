package memo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

class MemoTest {

	void selectTest() throws Exception {
		MemoDAO dao = new MemoDAO();
		List<MemoVO> list = dao.getMemos();
		assertEquals(1, list.size());
	}
	
	@Test
	void insertTest() throws Exception {
		MemoDAO dao = new MemoDAO();
		dao.insertMemo(new MemoVO(0, "두번째 메모", "안녕하세요.", "sem", null, null));
		List<MemoVO> list = dao.getMemos();
		assertEquals(2, list.size());
	}

}



