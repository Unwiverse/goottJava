package goott;
// 키보드로 배열의 크기를 입력받아보자.

import java.util.Scanner;

import javax.naming.directory.SearchControls;

public class ArrayExam_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요: ");
		String[] str = new String[sc.nextInt()];
		
		for(int i=0; i<str.length; i++) {
			System.out.println((i+1)+"번째 문자열 입력: ");
			str[i] =sc.next();
		}
//		System.out.println();
//		// 문자열 배열에 저장된 내용을 화면에 출력해보자.
//		for(int i=0; i<str.length; i++) {
//			System.out.println("str["+i+"]: "+str[i]);
//		} System.out.println();
		
		  //문자열 배열에 저장된 문자열을 검색해보자. 
		System.out.println("검색할 문자열: "); 
		String search = sc.next();
		
			for(int i=0; i<str.length; i++) { 
				
			  if(search.equals(str[i])) {
				  
				  System.out.println("찾은 인덱스: str["+i+"]");
				  System.out.println("찾은 문자열: "+str[i]); } }
		  
		  sc.close();
	}		

}
