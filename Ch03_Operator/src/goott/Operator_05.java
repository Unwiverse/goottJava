package goott;

/* 
 *    2. 관계연산자(비교연산)
 *    - >=(크거나 같음), >, <=(작거나 같음), <, ==, !=(같지 않음)
 *	  - 결과값은  boolean(논리 연산자) 형으로 나옴 => true or false.
 *	  - 관계연산자는 제어문(조건문)에서 가장 많이 쓰임.
 */

public class Operator_05 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 5;
		System.out.println("(num1 >= num2) 결과>>>"+(num1 >= num2));
		System.out.println("(num1 <= num2) 결과>>>"+(num1 <= num2));
		System.out.println("(num1 == num2) 결과>>>"+(num1 == num2));
		System.out.println("(num1 < num2) 결과>>>"+(num1 < num2));
		System.out.println("(num1 > num2) 결과>>>"+(num1 > num2));
		System.out.println("(num1 != num2) 결과>>>"+(num1 != num2));
	}

}
