package classes;

public class Static_02 {

	public static void main(String[] args) {
//			System.out.println( "num(static 변수): "+Static.num);
//			System.out.println("adder() 메서드 호출: "+Static.adder(150, 37)); 
			Static static1 = new Static(); //인스턴스 변수는 객체 생성 후 출력 가능 ↓↓↓↓↓
			System.out.println("su1(인스턴스) 변수 값: "+static1.su1);
			System.out.println("su1(인스턴스) 변수 값: "+static1.su2);
			static1.sum(); // 인스턴스 멤버메서드 호출
	}

}
