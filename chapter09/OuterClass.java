package chapter09;

public class OuterClass {
	private int outerField;
	
	public OuterClass() {
	}

	
	class InnerClass {
		//필드
		private int innerField;

		//생성자
		public InnerClass() {
		}
		//메소드
		public int getInnerField() {
			return innerField;
		}
		public void setInnerField(int innerField) {
			this.innerField = innerField;
		}
	}
	
	static class StaticInnerClass{

		private int staticInnerField;
		
		public StaticInnerClass() {
		}
		public int getStaticInnerField() {
			return staticInnerField;
		}
		public void setStaticInnerField(int staticInnerField) {
			this.staticInnerField = staticInnerField;
		}
	}
	
	public int getOuterField() {
		return outerField;
	}

	public void setOuterField(int outerField) {
		this.outerField = outerField;
	}
	
	public void method() { //메서드 안에도 클래스를 만들 수 있다
		class LocalClass{
			private int localClassField;
			
			public LocalClass(int localClassField) {
				this.localClassField = localClassField;
			}
			
			public int getLocalClassField() {
				return localClassField;
			}
		}
	}
	

}
