package chapter07.Exercise;

public class Customer {
	//필드
	private String firstName; //고객이름
	private String lastName; //고객성
	private BankAccount account; //고객이 소유한 계좌
	
	
	//생성자
	public Customer(String firstname, String lastname) {
		this.firstName = firstname;
		this.lastName = lastname;
	}
	
	//메소드
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public BankAccount getAccount(){
		return this.account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	/*public String toString() {
//		return String.format("이름 : "+firstName+lastName,account.getBalance());
		return "이름 : "+firstName+" "+lastName + ", 잔고 : " + account.getBalance() + "원";
	}*/
	public String toString() {
		return String.format("이름: %s %s, 잔고: %,d원", firstName, lastName, account.getBalance());
	}

}
