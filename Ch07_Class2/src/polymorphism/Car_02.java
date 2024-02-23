package polymorphism;

public class Car_02 {

	public static void main(String[] args) {
		//필드의 다형성
		Car car = new Car(); //Car 클래스에 객체로 접근
		
		car.tire = new HankookTire(); // 차량의 tire 필드를 HankookTire 객체로 초기화한다.
		//Car 클래스가 Tire 인터페이스를 포함하고 있음. tire 필드를 HankookTire 클래스 객체로 초기화
		car.run(); // car 객체로 HankookTire 클래스 run 메소드 호출 
		
		car.tire = new KumhoTire(); 
		car.run();
		

	}

}
