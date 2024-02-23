package generic;

public class GenericExample {

	public static void main(String[] args) {
		HomeAgency homeagency = new HomeAgency();
		Home home = homeagency.rent();
		home.identify();
		
		CarAgency caragency = new CarAgency();
		Car car = caragency.rent();
		car.run();
	}

}
