package util;

import java.util.Random;

/*
 * Util 패키지의 주요 클래스
 * 1. Random 클래스
 * - 임의의 난수를 발생시키는 클래스.
 * 2. Math 클래스
 * - 수학과 관련된 메서드를 제공하는 클래스
 * - 유일하게 java.lang 패키지에 있는 클래스
 * 3. Calendar 클래스
 * - 날짜/시간 관련 정보를 제공하는 클래스
 * 4. Arrays 클래스
 * - 배열 객체를 처리해 주는 클래스.
 */

/*
 * 1. Random 클래스
 * - 지정된 범위 내에서 임의의 난수를 발생시키는 클래스
 * - 활용 분야: 게임, 확률 등에서 사용됨.
 * - 형식) nextInt(가장 큰 수)+시작 수 
 */

public class Random_01 {

	public static void main(String[] args) {
		Random random = new Random();
		//로또 만들어보자 ==> 중복 발생
		for(int i=1; i<=6; i++) {
			int su = random.nextInt(45) + 1;
			System.out.print(su+"\t");
		}
		System.out.println();
		
		
		int[] lotto = new int[6];
		//로또 번호 생성
		for(int i=0; i<6; i++) {
			lotto[i] = random.nextInt(45) +1;
			//중복체크 중복 번호 제거
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i]+"\t");
		}
		System.out.println();
	}

}
