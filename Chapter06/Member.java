package Chapter06;

public class Member {
	
		String name;
		String id;
		String password;
		int age;
		
		Member(){
			this(null, null);//힙 영역에 Member라는 클래스를 생성하고 그 주소값 반환
			password = "1234";
		}
		
		Member(String name){ //데이터의 갯수에 따라서 생성자가 1개만 로딩을 해야되는데 1개 이상 오버해서 로딩할 수 있다=오버로딩)
			//String n = "d
			this(name, null);
		}
		Member(int age,String name){ //데이터의 갯수에 따라서 생성자가 1개만 로딩을 해야되는데 1개 이상 오버해서 로딩할 수 있다=오버로딩)
			//타입이 다른 거 가능, 
			//(String id, String name) <- 똑같은 스트링끼리는 순서가 다르선 안된다. 
		}
		
		Member(String name, String id){
			this.name = name;
			this.id = id;
			System.out.println("Memeber class가 생성됨");
		}
		
}
