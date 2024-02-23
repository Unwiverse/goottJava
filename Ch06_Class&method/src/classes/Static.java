package classes;
/*
 * 자바에서 사용되는 용어들
 * 1. 변수: 프로그램이 끝날 때까지 언제든지 변할 수 있는 데이터.
 * 				==> 소문자로 시작
 * 
 * 2. 상수: 프로그램이 끝날 때까지 절대 변하지 않는 데이터.
 * 				==> 모든 글자가 대문자. 
 * 
 * 3. instance(인스턴스) 변수/메서드
 *     - 객체의 생성과 동시에 만들어지는 변수/메서드.
 *     - 객체는 heap 메모리 공간에 만들어짐.
 *        ==> 반드시 객체 후에 사용이 가능함.
 *     - 호출방법: 참조변수, 멤버변수/ 참조변수, 멤버메서드
 *     
 * 4. static(정적) 변수/ 메서드
 * 		- 객체의 생성과 상관없이 별도로 만들어지는 변수/메서드.
 * 		- static 메모리(method 영역)에서 별도로 만들어짐.
 * 		- 객체를 생성하지 않아도 어느 클래스나 접근 가능.
 * 		- 접근하는 방법은 쉬우나 실제로 항상 메모리에 상주하게 되어 메모리 회수가 안되는 단점이 있음. 시스템이 며칠 후
 * 		  몇 주 혹은 몇 달 정도 가동이 되면 점점 느려지는 현상이 발생함.
 * 		  호출방법: 클래스이름, 멤버변수/클래스이름, 멤버메서드
 */

public class Static {
		//멤버변수
		int su1 = 100; //인스턴스 멤버변수
		int su2 = 200; //인스턴스 멤버변수
//		static int num = 500;//static(정적) 멤버변수
		// 멤버메서드 
		void sum() {// 인스턴스 멤버메서드
			System.out.println("sum: "+(su1+su2));
		} //sum() 메서드 end
//		static int adder(int num1, int num2) {
//			return num1+num2;
//		} // adder()메서드 end
}
 