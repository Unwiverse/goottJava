package string;

import java.util.StringTokenizer;

/*
 * StringTokenizer 클래스
 * - 기준문자(delimiter)를 기준으로 문자열을 
 * 	  잘라주는 파싱 클래스.
 * - 기준 문자로 분리된 문지열을 토큰이라함.
 * - 웹에서 전화번호를 하이픈(-)을 기준으로 앞자리,중간자리,뒷자리
 *   형식으로 구분해서 추출할 때 씀.
 *   (예: 주민번호, 핸드폰 번호 등) 
 */

public class String_05 {

	public static void main(String[] args) {
		String str = "id=hong&pwd=1234&name=홍길동&age=27&phone=010-5002-8033&addr=화곡동 번지구";
		StringTokenizer st = new StringTokenizer(str, "&");
		//countToken(): 기준 문자로 분리된 토큰의 개수를 정수값으로 반환해주는 메서드
		System.out.println("카운트 토큰 수: "+st.countTokens());
		
		//hasMoreTokens(): 반활할 다음 토큰이 있는지를 확인하는 메소드
		// 							  있으면 true 값을, 없으면 flase 값을 반환.
		while(st.hasMoreTokens()) {
			//nextToken():  존재하는 토큰을 문자열로 반환해주는 메서드
			System.out.print(st.nextToken()+"\t");
			
		}

	}

}
