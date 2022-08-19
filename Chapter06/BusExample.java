package Chapter06;

public class BusExample {

	public static void main(String[] args) {
		Bus bus1 = new Bus();
		System.out.println("bus1.company : "+bus1.company);
		System.out.println();
		
		Bus bus2 = new Bus("자가용");
		System.out.println("bus2.company : "+bus2.company);
		System.out.println("bus2.model : "+bus2.model);
		System.out.println();
		
		Bus bus3 = new Bus("자가용", "빨강");
		System.out.println("bus3.company : "+bus2.company);
		System.out.println("bus3.model : "+bus2.model);
		System.out.println("bus3.color : "+bus3.color);
		System.out.println();
		
		Bus bus4 = new Bus("택시","검정",200);
		System.out.println("bus4.company : "+bus4.company);
		System.out.println("bus4.model : "+bus4.model);
		System.out.println("bus4.color : "+bus4.color);
		System.out.println("bus4.maxSpeed : "+bus4.maxSpeed);
		System.out.println();

	}

}
