package chapter08.Exercise;

public class SavingsAccount extends BankAccount { // 저축계좌
	//필드
	private double interestRate; //이자율
	
	//생성자
	public SavingsAccount(int balance, double interestRate) {
		super(balance);
		//this.balance = balance;
		this.interestRate = interestRate;
	}
	
	//메소드
	@Override
		public String getAccountType() {
			return "저축예금";
		}
	
	public void updateBalance(int period) {
		// 저축기간
		// 단리 원리금 = 원금 * 이율 * 기간 + 원금
		// 저축기간 월단위 /12 ?
		
		// 년 단위 이자 
		//super.deposit( (int)(balance * period * interestRate + balance) );
		balance += balance * interestRate * period;
	}
}
