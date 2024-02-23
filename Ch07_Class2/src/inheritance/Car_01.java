package inheritance;

public class Car_01 {

	public static void main(String[] args) {
		
		/*
		 *   Sonata 클래스 객체 생성 과정
		 * - Sonata 클래스의 객체 생성 시에 JVM은
		 *   Car라는 부모 클래스의 객체를
		 *   먼저 생성한 후에 Sonata 클래스의 객체를 생성한다. 
		 */
		
		Sonata sonata = new Sonata();
		sonata.model = "소나타";
		sonata.cc = 3000;
		sonata.door = 4;
		sonata.getCarInfo();
	}

}
