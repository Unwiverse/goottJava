package goott;

/*
 * 5. 배정연산자/단축배정연산자
 *    - 배정연산자(=)
 *      형식) 변수 = 변수 or 수식 or 값;ㅣ
 *           - 좌변에는 항상 변수명
 *           - 우변에는 숫자, 변수명, 수식이 와야 함.
 *    - 단축배정연산자
 *      배정연산자를 간편하게 사용하는 연산자. 
 */

public class Operator_08 {

	public static void main(String[] args) {
		//배정연산자
		//형식) 변수명 = 값(데이터)
		int su1 = 10, su2= 28, result =0; //result 초기값
		
		// 형식) 변수명 = 변수명
		su1 = su2;
		// 형식) 변수명 = 수식
		su1 = su2 + 27;
		
		System.out.println("su1>>>"+su1);
		System.out.println("su2>>>"+su2);
		System.out.println("");
		
		//단축배정연산자
		result += 10; //== result = result +10;
		System.out.println("result>>>"+result);
		System.out.println("");
		
		int sul = 15;
		
		sul += 5; // sul=sul+5;
		System.out.println("sul>>>"+sul);
		System.out.println();// 20
		
		
		sul *= 5; // sul=sul*5;
		System.out.println("sul>>>"+sul);
		System.out.println(); //100
		
		
		sul /= 5; // sul=sul/5;
		System.out.println("sul>>>"+sul);
		System.out.println(); //20

	}

}
