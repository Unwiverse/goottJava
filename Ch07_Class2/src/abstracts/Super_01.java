package abstracts;

public class Super_01 {

	public static void main(String[] args) {
		// Super super = new Super(); //추상클래스는 객체 생성 불가
		Sub sub = new Sub(); // 자식 클래스는 가능
		
		sub.num1= 35;
		System.out.println("cal() 메서드 호출: "+sub.calc());
		sub.output();

	}

}
