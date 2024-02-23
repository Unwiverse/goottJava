package goott;

/*
 * 단일문자형: char형(0~65535) => 2바이트(-2^15~2^15-1)
 * - 자바에서는 유니코드(UTF-8) 체계로 단일문자가 처리됨.
 */
public class Variable_06 {

	public static void main(String[] args) {
		char ch1= 'B';
		System.out.println("ch1>>>"+ch1);
		System.out.println((char)(1+ch1)); // 66(B)+1==>67(C) 유니코드 참조
		System.out.println(1+ch1);
	}

}
