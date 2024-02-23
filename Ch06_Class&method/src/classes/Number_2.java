package classes;

public class Number_2 {

	public static void main(String[] args) {
		Number number = new Number();
		
		//private 변수라서 직접 접근 불가
		//		number.num1=100; 
		
		number.setNum1(100);
		number.setNum2(200);
		
		System.out.println("num1: "+number.getNum1());
		
		System.out.println("num2: "+number.getNum2());
	}

}
