package goott;

public class WhileExam_19 {

	public static void main(String[] args) {
		
		// ABCDEFGHIGK.....XYZ까지 문자를 출력해보자.
		char alpha = 'A'; // 반복문에서 초기식, char는 단일문자 자료형
		while(alpha <= 'Z') { //반복문에서 조건식(필수)
			System.out.print(alpha);
			alpha++; // 반복문의 증감식(필수)
		}
		System.out.println(" ");
		
		 // 알파벳 나열 순서 반대로
		char alpha2 = 'Z';
		while(alpha2 >= 'A') {
			System.out.print(alpha2);
			alpha2--;
		}
	}

}
