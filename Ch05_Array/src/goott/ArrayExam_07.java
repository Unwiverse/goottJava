package goott;

import java.util.Scanner;

public class ArrayExam_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * ★★★★★★★★★★★★★★★★★★★★★★
		 * ★★★★★★★★★★★★★★★★★★★★★★
		 * ★★★★★★★★★★★★★★★★★★★★★★
		 * ★★★★★★★★★★★★★★★★★★★★★★
		 * 매우 중요한 개념임.
		 * 배열의이름은 heap 메모리 영역이 만들어진 곳의
		 * 시작 주소값을 가지고있어서 아래의 문장은 다른 배열의
		 * 메일명에 주소값을 복사해주는 명령어임.
		 * 즉, 배열의 공유가 이루어지게됨.
		 */
		System.out.println("문자열 배열 크기 입력: ");
		String[] str = new String[sc.nextInt()];
		String[] strCopy = str; //주소값을 복사
		System.out.println("str 배열 주소값: "+str);
		System.out.println("strCopy 배열 주소값: "+strCopy);
		// strCopy 배열에 초기값을 할당해보자.
		for(int i=0; i<strCopy.length; i++) {
			System.out.println((i+1)+"번째 문자열 입력: ");
			strCopy[i] = sc.next();
		}
			// str 배열에 있는 데이터를 출력해보자.
			for(int i=0; i<str.length; i++) {
				System.out.println("str["+i+"]: "+str[i]);
			}	

	}

}
