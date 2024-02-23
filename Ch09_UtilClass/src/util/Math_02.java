package util;

/*
 * 2. Math 클래스
 * - 수학과 관련된 메서드를 제공해주는 클래스.

 */

public class Math_02 {

	public static void main(String[] args) {
		//1. max():최대값 구하기 메소드. 비교 시 두 수를 가지고 비교.
		//2. min():최소값 구하기 메소드. 비교 시 두 수를 갖고 비교.
		//3. round(): 반올림적용 메소드.
		//4. abs(): 절댓값 구하는 메소드.
		//5. ceil(): 무조건 올림 메소드.
		
		int num1 = 78, num2 = 96;
		System.out.println("최댓값: "+Math.max(num1, num2)); // 정적 클래스, 메소드 호출 방법: 클래스명.메서드명()
		System.out.println("최댓값: "+Math.min(num1, num2)); // 정적 클래스, 메소드 호출 방법: 클래스명.메서드명()
		System.out.println(Math.round(125.5124)); //126
		System.out.println(Math.abs(-125.77));
		System.out.println(Math.ceil(177.1));

	}

}
