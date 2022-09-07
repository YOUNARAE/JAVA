package chapter08.Exercise;

public abstract class BankAccount {
	//필드
	protected int balance; //잔액변수
	
	//생성자
	public BankAccount(int balance){
		this.balance=balance; //잔액변수
	}
	//추상메소드
	public abstract String getAccountType();
	/**
	 * 계좌의 종류를 반환하는 메소드
	 * @return 계좌의 종류(저축예금, 당좌예금)
	 */
	//메소드
	public int getBalance() { //현재 계좌의 잔액
		return this.balance;
	}
	public void deposit(int amount) {//입금 메소드
		//입금이란 현재 계좌에 새로 돈을 추가하는 것
		balance += amount; //통장잔고에 총액을 추가해준다	
	}
    public boolean withdraw(int amount) {//출금 메소드
    	//출금이란 현재 계좌(잔액)에서 금액을 빼는 것
    	//출금액이 계좌잔액보다 클 수도 있고 작을 수도 있다.
    	//출금액이 계좌잔액보다 크면 실행 안되야함.
    	//출금액이 계좌잔액보다 작으면 실행해도 됨
    	if(amount>=balance) {
    		return false;
    	}
    	balance -= amount;
    	return true;
    }
    public boolean transfer(int amount,BankAccount otherAccount) { //계좌이체
    	//송금하기
    	//출금액이 계좌잔고보다 크면 송금해선 안된다
    	//출금액이 계좌잔고보다 적으면 송금해도 된다.
    	//송금하면 다른 계좌에는 그 송금액이 더해진다
    	//송금하면 내 계좌에서 송금액만큼 줄어든다.
    	if(amount<=balance){
    		this.balance -= amount;
    		otherAccount.deposit(amount);
    		return true;
    	} 
    	return false;
    }
    //메소드 추가
    public String toString() {
    	return String.format("%,d",balance);
    }
}
