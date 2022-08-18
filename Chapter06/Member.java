package Chapter06;

public class Member {
	
		String name;
		String id;
		String password;
		int age;
		Member(){
		}	
		Member(String n){ //데이터의 갯수에 따라서 생성자가 1개만 로딩을 해야되는데 1개 이상 오버해서 로딩할 수 있다=오버로딩)
			name = n;
		}//이게 생략되어 있음
		Member(String n, String i){
			name = n;
			id = i;
		}
}
