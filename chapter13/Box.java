package chapter13;

public class Box<E extends Object> {
	private Object value;
	
	public Box(E value) {
		this.value = value;
	}
	
	public E getValue() {
		return (E) value;
	}

	public void setValue(E value) {
		this.value = value;
	}
	

}
