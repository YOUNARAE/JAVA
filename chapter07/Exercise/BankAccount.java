package chapter07.Exercise;
 
public class BankAccount {
	//필드
	private int balance; //잔액 변수

	//생성자
	public BankAccount() { //기본생성자
	}

	public BankAccount(int balance) { 
		this.balance = balance; //잔액
	}

	//메소드
	public int getBalance() {
		return this.balance; //getBalace는 잔액을 받는 메소드 
	}
	
	public void deposit(int amount /*입금액*/) {
		//입금기능
		this.balance += amount; 
	}
	/**
	 * 
	 */
	
	/** 출금 메소드
	 * 
	 * @param amount 출금할 금액
	 * @return 출금 성공시 true, 실패시 false 반환
	 */
	
	//출금기능
	public boolean withdraw(int amount /*출금액*/) {
		// 체크 잔금보다 많은지
		if(amount <= balance) {
			this.balance -= amount;  // 출금 실행
			return true;
		}
		return false;
	}

	/**
	 * 이체메소드
	 * @param 
	 * @param amount 이체할 금액
	 * @param otherAccount 이체될 계좌번호
	 * @return 이체 성공시 true, 실패시 false 반환
	 */
	//현재계좌에서 다른 계좌로 송금하는 기능
	public boolean transfer(int amount /*송금액*/, BankAccount otherAccount) {
		// 체크 잔금보다 많은지
		if(withdraw(amount)) { //내꺼에서 출금이 성공하면
			otherAccount.deposit(amount); //상대방꺼에있는거에서 입금
			return true;
		}
		return false;
		/*내가 풀은 것
		if(amount<=balance) {
			this.balance -= amount; // 출금
			otherAccount.deposit(amount);  // 다른 계좌 입금
			return true;
		}
		return false;
		*/
	}

}
