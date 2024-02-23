package generic;

public class Goods {
	private Object object; 

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) { 
		//이 메서드는 매개변수로 Object 타입의 객체를 받음. 이는 어떤 타입의 객체든 받을 수 있음을 의미함.
		this.object = object;
	}
	
}
