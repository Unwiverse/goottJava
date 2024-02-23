package finals;

/*
 * final 지정자 
 * - 클래스나 멤버변수, 멤버메서드에 적용해서 씀.
 * - 클래스: - 변경할 수 없는 클래스, 확장안되는 클래스.
 * - final로 지정된 클래스는 다른 클래스의 조상(부모) 클래스가 될 수 없음.
 * - 멤버메서드: - 변경할 수 없는 메서드.
 * 						 - final로 선언된 메서드는 오버라이딩(재정의)를
 * 							통해 메서드를 재정의 못함.
 * - 멤버변수: - 변수명 앞에 final이 붙으면 값 변경이 안됨 ==>상수가됨.
 * 
 * ※대표적인 final 클래스는 String 클래스와 math 클래스임.
 */

class AA {
	final int su = 295; //상수로 인식 ==> 값 변경안됨.
	final void output() {
		System.out.println("final output() 메서드 호출");
	}
}
class BB extends AA{
	
	//su =137; //final이 붙어 상수가 됐으므로 값 변경 불가.
	
//	@Override
//	void output() { // final 때문에 오버라이딩 불가
//		System.out.println("output() 메서드 재정의");
//	}
}

final class CC {}

//final class DD extends CC{
//	//final로 지정된 클래스는 다른 클래스의 부모 클래스가 될 수 없음.
//}

public class Final {
	
}

