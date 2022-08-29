package chapter07;

public class InstanceExample {
	 public static void method(Parent parent) {//Parent parent = new Child();
		 if (parent instanceof Child) {
			 Child child = (Child) parent;
			 child.name = "대한민국";
			 System.out.println(child.name);
		} else {
			System.out.println("강제 형변환 할 수 없습니다.");
		}
	 }
	 public static void main(String[] args) {
		 method(new Child());
		 method(new Parent());
	 }
 
}
