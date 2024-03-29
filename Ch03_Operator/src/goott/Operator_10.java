package goott;

/*
 * 7. 쉬프트 연산자(비트 이동 연산자)
 *    - 비트를 대상으로 왼쪽/오른쪽으로 비트를 밀어서 연산을 수행하는 연산자.
 *    - 왼쪽 쉬프트(<<): 왼쪽으로 비트 수만큼 이동하는 연산자.
 *    				  오른쪽에 비어 있는 칸(비트)은 0으로 채워짐.
 *    - 부호 있는 오른쪽 쉬프트(>>): 오른쪽으로 비트 수만큼 이동하는 연산자.
 *    							왼쪽에 비어 있는 칸(비트)은 부호비트로 채워짐.
 *    - 부호 없는 오른쪽 쉬프트(>>>):오른쪽으로 비트 수만큼 이동하는 연산자.
 *    							왼쪽에 비어있는 빈 칸은 무조건 0으로 채워짐.
 *    ※ 부호 비트:양수(0), 음수(1)    
*/		

public class Operator_10 {

	public static void main(String[] args) {
		int num1 = 10, num2 =5;
		//십진수를 이진수로 변환하는 작업이 필요함.
		//num1= 1010, num2 = 0101;
		
	// 왼쪽 쉬프트(<<)
	   System.out.println("왼쪽 쉬프트>>>"+(num1<<2)); // 40
	   System.out.println(); 
	// 오른쪽 쉬프트(>>)
	   System.out.println("오른쪽 쉬프트>>>"+(num1>>1)); // 40
	   System.out.println();
	   System.out.println("오른쪽 쉬프트>>>"+(num2>>1)); // 5
	}

}
