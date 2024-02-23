package inner;

/*
 * 3. 중첩 클래스 선언
 * 
 * 중첩 클래스(inner class)?
 * 1. 클래스 내부에 또다른 클래스 선언.
 * 		==> 두 클래스가 서로 긴밀한 관계로 연결돼있는 경우 쓰임.
 * 				두 클래스 멤버 간에 서로 쉽게 접근할 수 있다는 장점이 있음.
 * 2. 내부 클래스를 하나의 멤버로 사용할 수 있음.
 * 3. 클래스 멤버: 멤버변수/메서드, 외부 클래스, 내부 클래스
 * 4. 내부 클래스 객체 생성 방법
 * 		형식)
 * 				외부클래스명, 내부클래스명 참조 변수 = 외부클래스 참조변수.new 내부클래스 생성자();
 * 
 * [내부 클래스 특징]
 * 내부 클래스는 외부 클래스의 멤버를 마치 자기 자신처럼 사용 가능.
 *  ==> 외부 클래스 멤버의 데이터를 변경시킬 수 있음.
 *  외부 클래스의 접근지정자가 private 접근지정자여도 접근 가능.
 *  내부 클래스의 접근은 반드시 외부 클래스를 통해 접근해야함.
 */

class Outer {//외부 클래스 
	private static final int su1 = 50; // 이 값 변경을 원하지 않으면 final 키워드 사용!
	private static final int su2 = 33;
	
	class Inner {//내부 클래스
		void output() {
			int su1 =137; //내부클래스에서 변수를 생성하면 이 값을 출력함
			int su2 = 133;
			System.out.println(su1);
			System.out.println(su2);
		}
		
	} // Inner  class end
}//outer class end

public class Inner_02 {

	public static void main(String[] args) {
		//중첩클래스 객체 생성법
		//1. 외부 클래스 객체가 먼저 생성돼야 한다.
		Outer out = new Outer();
		//2. 내부 클래스 객체 생성
		//형식) 외부클래스명.내부클래스명 참조변수 = 외부클래스 참조변수.new 내부클래스 생성자();
		Outer.Inner inner = out.new Inner();
		inner.output();
		}

}
