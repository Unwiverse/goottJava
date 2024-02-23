package polymorphism;

public class HankookTire implements Tire {

	@Override
	public void roll() { //Tire 인터페이스를 상속받아 멤버메서드를 재정의(오버라이드)
		System.out.println("한국 타이어가 회전합니다.");

	}

}
