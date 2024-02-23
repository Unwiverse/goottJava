package interfaces;

public class Inter_01 {

	public static void main(String[] args) {
		// 인터페이스는 객체생성 안됨, 근데 방법은 있음
		//Inter inter = new Inter();
			
		Sub sub = new Sub();
		//static final 상수로 인식함
		// 상수값을 변경하는 건 안됨
		//sub.num = 237;
		
		sub.output1();
		sub.output2();
	}

}
