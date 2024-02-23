package goott;

import java.io.IOException;
import java.io.InputStream;

/*
 * java에서의 입출력 (IOL Input/Output)방식
 * - 스트림이라는 방식을 이용함
 * - 스트림의 사전적 의미: 시냇물이라는 뜻을 가지고 있다.
 * 										즉, 데이터가 물 흐르는 거처럼
 * 										흐른다고 생각하면 편함
 * 
 * - java에서의 스트림: 순서가 있는 일련의 연속 데이터.
 * 						1) 바이트 스트림: 1. 바이트 단위로 데이터 입출력(byte).
 * 						2) 문자 스트림: 2. 바이트 단위로 데이터를 입출력(char).
 * 	- java 입출력 관련 클래스: java.io 패키지에 존재함.
 *   ==> 해당 패키지에 있는 클래스들을 이용해 파일을 입출력함.
 * - checked 방식의 예외 처리가 적용됨.
 * - java 입출력은 단방향성 ==> 한쪽으로만 입력되고 한쪽으로만 출력됨.
 * - FIFO(First In First Out) 선입선출로 출력됨. 
 */

public class FileIO_01 {

	public static void main(String[] args) {
		System.out.println("한 문자를 입력하세요");
		//System.in: 표준입력 장치
		InputStream is = System.in;
		
		try {
			int readByte = is.read();
			System.out.println("읽어온 데이터(ASCII): "+readByte);
			System.out.println("읽어온 데이터(문자): "+(char)readByte);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
