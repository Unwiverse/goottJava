package goott;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileIO_123 {

	public static void main(String[] args) throws Exception {
		OutputStream outputstream = new FileOutputStream("C:\\test\\Extr.txt");
		int value =0x11223344;
		outputstream.write(value);
		
	}

}
