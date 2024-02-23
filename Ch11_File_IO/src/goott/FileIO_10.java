package goott;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.Writer;

public class FileIO_10 {

	public static void main(String[] args) throws Exception {
		//원본 소스파일 경로
		FileReader fr = new FileReader("C:\\NCS\\workspace(java)\\Ch11_File_IO\\src\\goott\\FileIO_05.java");
		//원본 소스파일이 복사되어 저장될 파일 경로
		FileWriter fw = new FileWriter("C:/test/sample/sample.txt");
		while(true) {
			int readByte = fr.read();
			if(readByte == -1) {
				break;
			}
			fw.write(readByte);
		}
		fw.close(); fr.close();
		System.out.println("파일 소스 복사 완료");
	}

}
