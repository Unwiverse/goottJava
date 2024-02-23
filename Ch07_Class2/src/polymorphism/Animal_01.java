package polymorphism;

public class Animal_01 {

	public static void main(String[] args) {
		
		//일반적으로 객체 생성 방법
//		Cat cat = new Cat();
//		cat.sound();

		//다형성을 이용한 객체 생성 방법 ==> 인터페이스를 상속 받은 자식 클래스에 접근
		Animal cat = new Cat();
		cat.sound();
		
		//cat.prn(); //접근불가
		
		// 자식 클래스에서 만든 메소드가 부모 클래스에는 존재하지 않아서 다형성 원칙에 안맞음.
		//Cat cat1 = new Animal(); 
	}

}
