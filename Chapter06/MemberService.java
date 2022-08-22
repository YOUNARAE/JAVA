package Chapter06;

public class MemberService {
	
	boolean login(String id,String password) {
		
		if(id=="hong"&&password=="12345") {
			return true;
		} 
		return false;//메서드는 선언할 때 형태가 갖추어져 있어야한다.리턴타입이 있으면 써주고 시작해야
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다");
	}
}
