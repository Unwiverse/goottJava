package goott;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;
import java.nio.*;
/*
 * java 스트림의 종류
 * 1. 바이트 스트림 관련 클래스
 * 		- 바이트 스트림 방식으로 데이터를 입출력하는 클래스.
 * 			==> xxxInputStream / xxxOutputStream
 * 2. 문자 스트림 관련 클래스
 * 		- 문자 스트림 방식으로 데이터를 입출력하는 클래스.
 * 			==> xxxReader /xxxWriter
 * 
 * 3. 바이트 스트림 => 문자 스트림으로 변환하는 클래스.
 * 			==> InputStreamReader / OutputStreamWriter
 */

public class FileIO_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Writer writer = null;
		
		try {
			writer = new FileWriter("C:/test/test2.txt");
			System.out.println("한 줄을 입력하세요: ");
			String str = sc.nextLine();
			writer.write(str);
			writer.flush();
			
//			writer.close();
//			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch blockㅇ
			e.printStackTrace();
		} finally {
			// 입출력 관련 파일은 종료시켜 주는 것이 좋음.
			try {
				writer.close();
				sc.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}

}
