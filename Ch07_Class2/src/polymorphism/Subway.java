package polymorphism;

public class Subway implements Vehicle {

	@Override
	public void run() {
		System.out.println("지하철이 갑니다.");
	}

}
