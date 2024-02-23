package abstracts;

public class Galaxy extends SmartPhone{
	
	@Override
	void spec() {
		company ="삼성";
		name = "Galaxy S2";
		color = "white";
		size = "18cm";
		weight = "270g";
		price = "71만원";
		System.out.println("제조사: "+company+" / "+"단말기: "+name+" / "+"색깔: "+color+" / "+"크기: "+size+" / "+"무게: "+" / "+"가격: "+price);
		
	}

}
