package goott;
/*
 * 3. 논리연산자
 *    - 논리곱(&&) : 주어진 조건이 모두 참인 경우에만 결과가 true가 됨.
 *    				그 나머진 모두 false.
 *    - 논리합(||) : 주어진 조건 중 어느 하나라도 참이면 결과도 ture.
 *    				그 나머진 모두 false.
 *    - 부정(!)	 :  true는 false, false는 true가 됨.
 *    
 *    - 관계연산자의 결과값을 가지고 논리연산이 수행됨.
 */

public class Operator_06 {

	public static void main(String[] args) {
		int su1= 10, su2 = 7;
		// 논리곱인 경우 ==> true && true ==> 결과값 true
		boolean test = (su1 >= su2) && (su2 >= 5);
		System.out.println("test결과>>>"+test); // true
		
		// 논리곱인 경우 ==> true && false ==> 결과값 false
		test = (su1 >= su2) && (su2 <= 5);
		System.out.println("test결과>>>"+test); //false
		
		// 논리합인 경우 ==> false || true ==> 결과값 true
		test = (su1 <= su2) || (su2 >= 5);
		System.out.println("test결과>>>"+test); //true
		
	}

}
