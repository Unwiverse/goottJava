package polymorphism;

public class Cat implements Animal {

	@Override
	public void sound() {
		System.out.println("meow");
		
	}
	void prn() {
		System.out.println("ddd"); //자손클래스에서 만든 메서드라 Animal_01에서 접근못함.
	}

}
