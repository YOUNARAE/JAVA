package chapter10.Exercise;

import chapter10.LessNumberException;

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
	public int getBalance() { 
		return this.balance;
	}
	public void deposit(int amount) {	
	}
    public boolean withdraw(int amount) {
    	if(amount>=balance) {
    		return false;
    	}
    	balance -= amount;
    	return true;
    }
    public boolean transfer(int amount,BankAccount otherAccount) { 


    	if(amount<0||amount>balance) {
    		throw new IllegalArgumentException();
    	}
    	
    	this.balance -= amount;
		otherAccount.deposit(amount);
		return true;

    }

    //메소드 추가
    public String toString() {
    	return String.format("%,d",balance);
    }
}
