package polymorphism;

public class Car {
		//멤버변수
		Tire tire; //Tire 인터페이스를 멤버변수로 가져옴 (상속관계가 아닌 포함관계★★★★★★)
		
		void run() {
			tire.roll(); //멤버변수
		}
}
