package string;

/*
 * String 클래스의 단점
 * - 빈번하게 문자열 연산을 진행할 경우
 * 	  메모리를 많이 차지하게 됨.
 * - 매번 연산 시마다 새로운 객체를 생성하게 됨.
 *    ==> 메모리 영역의 과부하가 발생할 가능성이 큼.
 * - 이런 단점을 개선한 클래스가 등장함.
 *    ==> StringBuffer 클래스
 */

public class String_04 {

	public static void main(String[] args) {
		System.out.println("Honor Winds");
		StringBuffer sb = new StringBuffer("agent ");
		
		//1. append(): 문자열을 추가해주는 메서드.
		System.out.println(sb.append("vital sign: 0"));
		
		//2. replace(): 문자열을 교체하는 메서드.
		//		형식) replace(시작 index, 끝(-1) index, "교체할 문자열");
		sb.replace(0, 4, "python");
		System.out.println(sb);
		
		//3. substring() : 문자열을 추출하는 메서드.
		//		형식1) substring(시작 index, 끝(-1) index)
		// 	형식2) substring(시작 index)
		StringBuffer sb2 = new StringBuffer("2024/02/19 15:07:24");
		System.out.println("오늘 날짜: "+sb2.substring(0, 10));
		System.out.println("현재 시간: "+sb2.substring(11)); //index 11번째부터 끝까지~
		System.out.println();
		
		System.out.println("reverse(): "+sb.reverse());
		
		
	}

}
