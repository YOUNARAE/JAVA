package Exercise07;

public class Bank {
	//필드
	private Customer[] customers;
	private int numberOfCustomers;
	
	//생성자
	public Bank() { //배열의 크기를 10개로 초기화시켜줌
		customers = new Customer[10];
	}
	
	//메소드
	public void addCustomer(Customer customer) {
		//인자로 받은 customer를 customers배열에 할당한다.
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
	}
	
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	
	public Customer[] getCustomers() {
		return customers;
	}
	
	public Customer getCustomer(int index) {
		return this.customers[index];
	}
}
