package polymorphism;

public class Vehicle_03 {
	static void drive(Vehicle vehicle) {// Vehicle 인터페이스를 매개변수화, run() 메소드를 호출
		vehicle.run(); 
	}   //==> 주석처리된 부분은 Driver 클래스를 만들지 않을 경우를 상정함.

	public static void main(String[] args) {
		Vehicle_03 drive = new Vehicle_03();
		
		
		drive(new Bus());
		
		Taxi taxi = new Taxi();
		drive(taxi);
		
		Subway subway = new Subway();
		drive(subway);
		 
	}

}
