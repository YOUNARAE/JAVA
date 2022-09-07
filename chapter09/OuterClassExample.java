package chapter09;

import chapter09.OuterClass.InnerClass;
import chapter09.OuterClass.StaticInnerClass;

public class OuterClassExample {
	public static void main(String[] args) {	
		OuterClass outer = new OuterClass(); //이너클래스를 만들려면 아우터 먼저 만들어야한다
//		InnerClass inner = outer.new InnerClass();
		InnerClass inner = new OuterClass(). new InnerClass();
		inner.setInnerField(100);
		System.out.println(inner.getInnerField());
		
		new OuterClass.StaticInnerClass();
		System.out.println(inner.getInnerField());		
		
		StaticInnerClass staticInner = new OuterClass.StaticInnerClass();
		staticInner.setStaticInnerField(200);
		System.out.println(staticInner.getStaticInnerField());
		
		new chapter09.OuterClass();
	}
}
