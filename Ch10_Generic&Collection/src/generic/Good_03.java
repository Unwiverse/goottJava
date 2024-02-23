package generic;

public class Good_03 {

	public static void main(String[] args) {
		Good<Apple> good1 = new Good<Apple>(); //애플객체타입만 받음 형변환 x
		good1.setT(new Apple());
		Apple apple = good1.getT();
		
		apple.output();
		
		System.out.println();
		Good<Pencil> good2 = new Good<Pencil>();
		good2.setT(new Pencil());
		Pencil pencil = good2.getT();
		
		pencil.output();
	}

}
