package abstracts;

public class Iphone extends SmartPhone {

	@Override
	void spec() {
		company ="애플";
		name = "iphone 4S";
		color = "black";
		size = "22cm";
		weight = "300g";
		price = "155만원";
		System.out.println("제조사: "+company+" / "+"단말기: "+name+" / "+"색깔: "+color+" / "+"크기: "+size+" / "+"무게: "+weight+" / "+"가격: "+price);
		
		
	}

}
