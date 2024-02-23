package util;

import java.util.Arrays;

/*
 * Arrays 클래스
 * - 배열 객체를 처리해주는 클래스.
 */

public class Arrays_04 {

	public static void main(String[] args) {
		String[] str = {"홍길동", "세종대왕", "유관순"};
		for(String s : str) {//배열 출력 용도로 많이 쓰는 조건
			System.out.println("str 배열 요소: "+s);
		}
		System.out.println();
		//1. fill() : 배열의 요소를 특정한 값(데이터)으로 채우는 메소드. 
		Arrays.fill(str, "김유신"); //배열 인덱스 값을 "김유신" 문자열로 바꿈
		for(String s : str) {//배열 출력 용도로 많이 쓰는 조건
			System.out.println("str 배열 요소: "+s);
		}
		//2. equals(객체, 객체)
		// 두 객체의 내용(데이터)이 같은지 다른지 비교.
		// --> 반환타입은 boolean
		String[] str1 = {"가능충", "가능충", "가능충"};
		if(Arrays.equals(str, str1)) {
			System.out.println("두 객체의 내용은 같습니다.");
		} else {
			System.out.println("같지 않습니다.");
		}
		
		//3. sort(): 배열의 원소(데이터)를 정렬(오름차순)해주는 메서드.
		int[] arr = {54, 66, 81, 52, 123};
		Arrays.sort(arr);
		for(int k: arr) {
			System.out.print(k+"\t");
		}
		System.out.println();
		//내림차순
		for(int i=arr.length-1; i>=0; i--) { //Arrays.sort() 메서드가 적용된 상태
			System.out.print(arr[i]+"\t");
			}
			
}
}
