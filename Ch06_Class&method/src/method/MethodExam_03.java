package method;

/*
 * 매개변수가 있는 메서드 정의
 * 			형식)
 * 						[접근제한] 반환형 메서드이름(type 변수1, type 변수 2) {
 * 										메서드 호출 시 실행 문장;
 * 						}
 * 						- 실인수와 가인수
 * 						  * 실인수: 매개변수에 전달할 실제 값 == > 메서드 호출 시에 사용.
 * 						  * 가인수: 매개변수(가인수) == > 메서드의 정의.
 * 						  * 실인수와 가인수는 반드시 type, 순서, 개수가 일치해야 함(중요!)
 * 
 */

public class MethodExam_03 {
	public static void add(int i, int k) {
		System.out.println(i+"+"+k+"="+(i+k));
	}

	public static void main(String[] args) {
		
		add(150, 127);

	}

}
