package goott;

/* 4. 단항연산자/상항연산자
 *    - 단항연산자: 1개의 항을 대상으로 연산을 수행.
 *    - 상항연산자: 3개의 항을 대상으로 연산을 수행.
 */

public class Operator_07 {

	public static void main(String[] args) {
		// 단항연산자(++, --) 
		int su1=10, su2=10;
		System.out.println("su1++>>>"+ su1++); // 선 출력 후 연산(+1) => 10
		System.out.println("su2++>>>"+ ++su2); // 선 연산(+1) 후 출력 => 11
		/*
		 * 단항연산자(++, --)
		 * - 전위연산자: 단항연산자가 변수명 앞에 오는 경우(++su2).
		 * 		      변수 값을 하나 증가 또는 감소시킨 후에 처리.
		 * - 후위연산자: 단항연산자가 변수명 뒤에 오는 경우(su1--).
		 * 			  변수를 처리한 후 값을 하나 증가 또는 감소.
		 * 
		 */
		int su3 = 10, su4 = 20;
		System.out.println(++su3 + su4++); // 11+20 = 31
		System.out.println((++su3 % 3) + (su3 * ++su4)); // 0 + (12*21)
		
		/*
		 * 상항연산자
		 * 형식) (조건) ? 수식1: 수식2
		 * 		=> 수식 1: 조건이 참인 경우 실행 문장.
		 * 		=> 수식 2: 조건이 거짓인 경우.
		 * - 간단하게 조건문을 대신해서 사용할 수 있는 연산자.
		 * 
		 * 
		 */
		int num1 =45, num2 =33;
		String result= (num1 >= num2) ? "num1 값이 크다" : "num2 값이 크다"; //result ==> 문자열 변수
		System.out.println(result);
	}

}
