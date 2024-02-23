package goott;

public class Variable_08 {

	public static void main(String[] args) {
		// 변수 선언 및 변수 초기화.
		int su1 = 47, su2 = 83;
		System.out.println("변경하기 전....");
		System.out.println("su1>>>"+su1);
		System.out.println("su2>>>"+su2);
		
		// 두 변수의 값을 서로 바꾸는 방법
		// 방법 1
//		int temp= su1;
//		su1 = su2;
//		su2 = temp;
//		System.out.println("변경한 후...");
//		System.out.println("su1>>>"+su1);
//		System.out.println("su2>>>"+su2);
		
//		// 방법 2
//		int temp= su2;
//		su2 = su1;
//		su1 = temp;
//		System.out.println("변경한 후...");
//		System.out.println("su1>>>"+su1);
//		System.out.println("su2>>>"+su2);
		int su5 = 56;
		int su6 = 77;
		
		int temp1 = su6;
		su6=su5;
		su5=temp1;
		System.out.println("su5>>>"+su5);
		System.out.println("su6>>>"+su6);

	}

}
