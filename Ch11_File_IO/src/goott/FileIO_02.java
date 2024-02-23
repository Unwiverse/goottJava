package goott;

import java.io.FileInputStream;

import java.io.InputStream;

public class FileIO_02 {

	public static void main(String[] args) {
		//바이트 스트림 방식
		InputStream is = null;
		try {
			is = new FileInputStream("C:/test/text.txt");
			while(true) {
				
			int readByte =	is.read();
			
			if(readByte == -1) { //더 이상 읽을 데이터 없을 때 -1 반환
				break;
			}
			System.out.println("읽은 데이터: "+(char)readByte+", "+"남은 바이트 수: "+is.available());
			
			
			}
			
		} catch (Exception e) { //파일이 없을 때 예외처리
			e.printStackTrace();
		

			}
		}
}


