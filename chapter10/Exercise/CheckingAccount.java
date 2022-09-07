package chapter10.Exercise;

public class CheckingAccount extends BankAccount{ // 예금계좌
	//필드
	private SavingsAccount protectedBy; // 저축계좌
	
	//생성자
	public CheckingAccount(int balance) {
		super(balance);
	}
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	
	//메서드
	@Override
		public String getAccountType() {
			return "당좌예금";
		}
	
	@Override
	public boolean withdraw(int amount /* 출금액 */) {  // 출금계좌
		//만약 savingsAccount에 10000원이 있고,
		//checkingAccount에 5000원이 있을 경우
		//백지수표로 2500원 짜리 물건을 구매했을 경우
			if(amount > balance) {
				protectedBy.balance -= amount - balance;
				balance = 0;
				return true;
			} 
			return super.withdraw(amount);
			/*if(amount>balance) {
				
			// this.balance -= amount;
			// updateBalance.deposit(amount);
			// 초과되는 만큼의 돈을 참조하고 있는 protectedBy 에서 인출한다.
			protectedBy.withdraw(balance - amount);  //잔액에서 출금액 -> 초과금액
			// balance = 0;	
			
			return true;*/
	}
	
}
