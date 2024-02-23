package goott;

/*
 * 배열(array)
 * - 하나의 이름으로 동일한 자료형의 데이터를 여러개 연속적으로
 * 	  저장할 수 있는 메모리 공간을 할당 받는 걸 말함.
 * - 변수는 하나의 값만 저장하지만 배열은 여러개의 값을
 * 	  저장할 수 있음 ==> 같은 자료형의 데이터들이 연속적으로 저장됨.
 * - 배열은 선언과 함께 저장할 수 있는 자료형의 타입이 결정이 됨.
 *   만약 다른 자료형의 데이터를 저장하려면 타입 불일치 컴파일 오류가 발생함.
 * - 배열 방의 이름은 0이라는 인덱스부터 시작됨.
 * - 배열의 단점: 배열은 한 번 크기가 정해지면 크기를 늘리거나 줄일수ㅇ벗음.
 * [배열 사용하는 방법]
 * - 1단계: 배열선언 
 * 				형식) 자료형[] 배열명(배열이름) 또는 자료형 배열명[] ex) 
 * -2단계: 배열 메모리 생성(메모리 할당)
 * 				형식) 배열명 = new 자료형[배열의 크기]
 * -3단계: 배열 초기화 = 할당된 메모리 영역에 데이터를 저장.
 * -4단계:배열을 이용 = 데이터 처리(연산, 출력 등등)
 * 
 * [배열을 생성하는 방법 2가지]
 * 1. new 키워드를 이용해 배열 생성.
 * 2. 배열의 초기값을 이용하여 배열 생성.
 */

public class ArrayExam_01 {

	public static void main(String[] args) {
		// 1단계: 배열 선언
		// 형식) 자료형[] 배열명 또는 자료형 배열명[]
		int[] arr;
		// 2단계: 배열 메모리 생성(메모리 할당)
		arr = new int[5]; //heap 메모리(stack과 heap 메모리 개념)
		System.out.println("arr: "+arr); //stack 메모리에서 생성된 주소값으로 접근한 heap 메모리 주소가 출력됨
		// 3단계: 배열 초기화
		arr[0]= 10;
		arr[1] = 20;
		arr[2] = 40;
		arr[3] = 40;
		arr[4] = 10;									 
//		arr[5] = 20;									// 실행 시 오류(index 초과)
		
		//배열 연산
		arr[2] += 100;								// arr[2] = arr[2] +100;
		
		//4. 배열에 들어가있는 데이터 화면 출력
		System.out.println("arr[0]: "+arr[0]);
		System.out.println("arr[1]: "+arr[1]);
		System.out.println("arr[2]: "+arr[2]);
		System.out.println("arr[3]: "+arr[3]);
		System.out.println("arr[4]: "+arr[4]);
		
		System.out.println();
		
		//반복문 이용해서 배열을 출력
		for(int i=0; i<5; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		

		}	System.out.println();
	}	

}
