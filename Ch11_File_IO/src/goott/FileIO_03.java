package goott;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileIO_03 {

	public static void main(String[] args) {
		
		InputStream is = null;
		int readByte;
		try {
			is = new FileInputStream("C:\\Windows\\System.ini");
			try {
				while((readByte= is.read()) != -1) {
					System.out.print((char)readByte);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				is.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			} 
		}

	}

}
