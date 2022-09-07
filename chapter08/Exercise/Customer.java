package chapter08.Exercise;

//import chapter07.Exercise.BankAccount;

public class Customer {
	//필드
	private String firstName;
	private String lastName;
	private BankAccount[] accounts; //배열로 바뀌면 account가 복수가 된다
	int numberOfAccounts; // 계좌들의 갯수
	
	//생성자
	Customer(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5]; //필드가 아닌 생성자에서 초기하는 것이 권장된다(모든언어에 쓰기에)
	}
	
	//메소드
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	
	public void addAccount(BankAccount account) {
		this.accounts[numberOfAccounts++] = account;
	}
	
	public BankAccount getAccount(int index) {
		return accounts[index];
	}
	
	public int getNumberOfAccounts() {
		return this.numberOfAccounts;
	}
	
	
//	public BankAccount getAccount(int index) {
//		return this.getAccount(index);
//	}
//	public void setAccount(BankAccount account) {
//		this.account = account;
//	}
	
	@Override
	public String toString() {
//		return "이름 :"+firstName+" "+lastName+"잔고 :"+account.getBalance()+"원";
		return String.format("이름 : %s %s, 계좌의 갯수 : %,d", firstName, lastName, numberOfAccounts); //getNumberOfAccounts()
	}
	
}
