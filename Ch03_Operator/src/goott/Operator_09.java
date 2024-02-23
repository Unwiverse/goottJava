package goott;

/*
 * 6. 비트연산자 
 *    - 비트(0, 1)를 이용해 연산하는 연산자.
 *    - &(and): 두 비트 조건이 참(1)인 경우 1(참)을 반환. 그 외엔 0 반환.
 *    - |(or):  두 비트 중 하나만 조건이 참(1)인 경우 1 반환. 그 외엔 0 반환.
 *    - ^(xor): 두 비트 중 서로 다른 경우에 참(1)을 반환. 그 외에는 0 반환.
 *    
 *    ※ 비트 연산을 하기 위해서는 십진수를 이진수로 바꾸는 과정 필요.
 */

public class Operator_09 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 5, result;
		// 비트연산을 하기 위해서는 우선적으로 이진수로 변환.
		// num 1 = 1010, num 2 = 0101
		// and 연산
		result = num1 & num2; // 1010 & 0101 ==> 0000
		System.out.println("and result>>>"+result);
		// or 연산
		result = num1 | num2; // 1010 | 0101 ==> 1111
		System.out.println("or result>>>"+result); // 15
		// xor 연산
		result = num1 ^ num2; // 1010 ^ 0101 ==> 1111
		System.out.println("xor result>>>"+result); // 15
	}

}
