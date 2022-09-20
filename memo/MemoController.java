package memo;

import java.util.List;

public class MemoController {
	MemoService service = new MemoService();
	public List<MemoVO> getMemos() throws Exception {
		return service.getMemos();
	}
	
	public MemoVO getMemo(int searchNo) throws Exception {
		return service.getMemo(searchNo);
	}
	
	public int insertMemo(MemoVO vo) throws Exception {
		return service.insertMemo(vo);
	}

	public int updateMemo(MemoVO vo) throws Exception {
		return service.updateMemo(vo);
	}
	public int deleteMemo(int deleteNo) throws Exception {
		return service.deleteMemo(deleteNo);
	}
}