package method;

/*
 * 메서드 호출 양식 - 2가지
 * 1. call by value 방식
 * 		- 값을 전달해 호출
 * 		- 매개변수가 기본자료형(int, double 등) 사용
 * 
 * 2. call by refrence 방식★★★★★★★★★★★★
 * - 주소값을 전달해 호출하는 방식. 
 * - 매개변수가 참조자료형(배열, 클래스) 사용
 * - java에서 가장 많이 쓰는 방식.
 * 
 */

public class MethodExam_07 {
		public static void call(int num) {
			System.out.println(num);
		}
	public static void main(String[] args) {
		//1.call by value 방식
		int num =100;
		System.out.println("메서드 호출 전");
		System.out.println("num: "+num);
		System.out.println();
		
		
		System.out.println("메서드 호출 후");
		call(num);
	}

}
