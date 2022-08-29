package chapter07.Exercise;

public class Bank {
	//필드
	/**
	 * 은행의 고객 목록
	 */
	private Customer[] customers; // 은행의 고객목록
	/**
	 * 은행의 고객 수
	 */
	private int numberOfCustomers = 0; // 고객의 수가 몇명인지 알아야해서 필요함

	
	//필드의 값을 초기화할 때 생성자를 많이 사용한다
	// 생성자
	public Bank() {
		customers = new Customer[10]; //타입을 Customer라서 10으로 초기화한다
	}

	// 메소드
	public void addCustomer(Customer customer) { //인자 customer		
		//customers[0] = customer;
		//numberOfCustomers<-얘를 배열에 넣고 1씩 증가시키라는 뜻
		//customers[numberOfCustomers++] = customer;
		customers[numberOfCustomers] = customer;
		numberOfCustomers++;
	}

	public Customer[] getCustomers() {
		return customers;
	}
	
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}

	public Customer getCustomer(int index) { //배열에서 index에 해당하는 것을 반환해준다
		return this.customers[index];
	}

}
