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
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:/test/Extr1.txt"))) {
            int value1 = 0x11223344;
            dos.writeInt(value1); // 0x11223344 값이 4바이트로 출력됨
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

}
