package memo;

import java.util.List;

public class MemoService {
	MemoDAO dao = new MemoDAO();
	public List<MemoVO> getMemos() throws Exception {
		// business logic => transaction
		return dao.getMemos();
	}
	
	public MemoVO getMemo(int searchNo) throws Exception {
		return dao.getMemo(searchNo);
	}
	
	public int insertMemo(MemoVO vo) throws Exception {
		return dao.insertMemo(vo);
	}
	
	public int updateMemo(MemoVO vo) throws Exception {
		return dao.updateMemo(vo);
	}
	
	public int deleteMemo(int deleteNo) throws Exception {
		return dao.deleteMemo(deleteNo);
	}
}