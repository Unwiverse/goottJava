package goott;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
 * 파일 복사
 * - koala,jpg: 원본 이미지 파일
 * - copied.jpg: 복사 이미지 파일
 */

/*
 * 1. FileInputStream / FileOutputStream
 * 		- 1. 바이트 단위로 파일을 처리하는 바이트 기반 입출력 파일 스트림.
 * 		- 그림(이미지), 오디오 파일, 비디오파일 등 모든 종류의 파일 처리가 가능함.
 * 2. FileReader/ FileWriter 
 * 		- 2바이트 단위로 파일을 처리하는 문자 기반 입출력 파일 스트림.
 * 		- 문자 단위로 파일을 처리하기 때문에 그림, 오디오 파일 등은 처리안됨.
 * 		- 문자(2바이트) 단위로 처리가 되서 한글이 들어있는 파일처리 가능.
 */

public class FileIO_08 {

	public static void main(String[] args) throws Exception {
		//원본 이미지 파일 경로
		FileInputStream fis = new FileInputStream("C:/test/koala.jpg");
		//원본 이미지 파일이 복사되어 저장될 경로
		FileOutputStream fos = new FileOutputStream("C:/test/copied.jpg");
		
		while(true) { //이미지 파일의 용량을 알 수 없기 때문에 while문 씀
			int readByte = fis.read();
			if(readByte == -1) {
				break;
			}
			fos.write(readByte);
			
		}
		fos.close(); fis.close();
		System.out.println("이미지 복사 완료");
	}

}
