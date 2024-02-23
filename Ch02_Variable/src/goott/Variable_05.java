package goott;

/*
 * 실수자료형: 소수점이 발생하는 자료형.
 * - float: 소수점 이하 6~7자리까지 표현이 가능.
 * - double: 소수점 이하 15~16자리까지 표현이 가능.
 */

public class Variable_05 {

	public static void main(String[] args) {
		double dNum = 123.45666;
		System.out.println("dNum>>>"+dNum);
		
	    // 실수 자료형은 double(8byte)이 기본★
		float fNum = 1245.78954f; // = float fNum = (float)1245.78954;
		System.out.println("fNum>>>"+fNum);
		
	/*
	 * float 자료형의 변수에 실수 값을 저장 시 오류 발생.
	 * 이유 : 실수 자료형의 기본형은 double형이기 때문임.
	 * 그래서 float 자료형의 변수에 실수 데이터를 저장 시
	 * 반드시 실수 값 앞에 float라고 형변환을 해주거나
	 * 아니면 값 뒤에 f를 붙이면 됨.
	 * - 자료 손실은 거의 없음.
	 */
		int s = 190; // 자료형이 int(4바이트)인 변수 's'에 190(값)을 할당
		byte d = 56; // 자료형이 byte(1바이트)인 변수 'd'에 56을 할당
		byte d2 = (byte)s;
		System.out.println("d2>>>"+d2);
		long x = 28000;
		byte y = 125;
		byte y2 = (byte)x;
		System.out.println("y2>>>"+y2);
		
		double L = 728.92; //자료형이 double인 변수 'L'에 값 728.92 할당
		float I = 728.9211f; //자료형이 float인 변수 'I'에 값 728.9211을 할당하고 float로 명시적 형변환. 왜냐면 실수 자료형의 default 자료형은 double이기 때문에 오류를 방지하기 위함. 
		float M = (float)L; // 자료형이 float인 변수 'M' 선언 후 float로 명시적 형변환을 한 변수 'L'의 할당값 부여.
		System.out.println("M>>>"+M); // 결과 출력
	 }

}
