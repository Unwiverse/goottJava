package generic;

public class Goods_02 {

	public static void main(String[] args) {
		
		
		Goods goods1 = new Goods(); //Goods 클래스의 새 객체로 goods1 생성
		Goods goods = new Goods();
		
		goods.setObject(new Apple());
		Apple apple = (Apple)goods.getObject();
		apple.output();
		
		goods1.setObject(new Pencil()); 
		//goods1이라는 인스턴스가 가진(저장된) 정보는 setObject()메서드로 생성한 Pencil 클래스 객체의 주소값이다.
		//즉, goods1 인스턴스로 setObject 메서드를 호출해 매개변수의 정보를 받고 유지함.
		Pencil pencil = (Pencil)goods1.getObject(); //Apple/Pencil 객체 타입으로 형변환
		//Pencil 클래스의 pencil 객체(인스턴스)는 위에서 만든 Pencil 객체의 주소값을 가진 객체 goods1를 매개로
		// getObject()메서드를 호출해 goods1에 저장된 Pencil 객체를 반환해 할당받음.
		// pencil 변수에는 getObject() 메서드의 object 변수에 저장된 객체의 주소값이 있음.
		pencil.output();
		
		/*
		 * 데이터를 저장할 때는 상관없지만 저장된 데이터를 각각의 타입(Apple, Pencil)을 꺼내오기 위해서는 저장된 형태로 
		 * 캐스팅(현변환)을 해야함. 필드 자체가 Object 타입이라 get()메서드로 가져오는 타입 또한 항상 Object 타입이 됨.
		 * 따라서 Apple 객체를 저장했을 땐 get()메서드로 가져온 ★Apple★ 타입으로, Pencil 객체를 저장했을 땐 가져온 Object 
		 * 타입을 Pencil 객체 타입으로 캐스팅을 해줘야 함. 정확하게 해당 객체 타입으로 형변환을 해줄 땐 문제가 발생 안하지만
		 * 다른 객체 타입으로 형변환을 해주면 실행 중 예외(ClassCaseException)가 발생할 수 있다.
		 * 이러면 정상적으로 프로그램이 종료되지 않을 수 있기에
		 * 
		 * Object 타입으로 선언된 변수에 데이터가 들어가는 경우, 해당 변수에 있는 값을 꺼내고 싶은 경우에는 반드시 형변환(캐스팅)
		 * 작업이 필수임. 이런 형변환 작업이 자주 일어나게 되면 프로그램 성능이 저하됨
		 * 이런 문제점을 해결하는게 바로 제네릭(generic)임.
		 */

	}

}
