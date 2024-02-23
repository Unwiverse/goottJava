package inheritance;
//자식클래스
public class Sonata extends Car {

	String model; //차량 모델명
	// int cc;
	// int door;
	
	void getCarInfo() {
		System.out.println("모델명: "+model);
		System.out.println("배기량: "+cc);
		System.out.println("차량 문 수: "+door);
		
	}

}
