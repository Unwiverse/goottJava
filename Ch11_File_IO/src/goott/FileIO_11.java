package goott;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileIO_11 {

	public static void main(String[] args) {
		File temp = new File("C:/Windows/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm"); //a: am or pm 구분

		/*
		 * listFiles()
		 * ==> 디렉토리에 포함된 파일 및 서브 디렉토리 목록
		 * 			전부를 확인하며 File 객체 배열로 반환해주는 메서드.
		 */
		File[] contents = temp.listFiles();
		System.out.println("이름\t형태\t크기\t날짜\t시간");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		
		for(File file : contents) {
			if(!file.isDirectory()) {
				System.out.print(file.getName());
			} else {
				System.out.println("<DIR>\t"+file.getName()+"\t"+file.length());
			}
			 System.out.println(sdf.format(new Date(file.lastModified())));
			 System.out.println();
		}
	}
}


