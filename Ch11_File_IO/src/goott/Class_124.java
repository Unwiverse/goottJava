package goott;

import java.io.FileOutputStream;

public class Class_124 {

	public static void main(String[] args) throws Exception {
		
			FileOutputStream os = new FileOutputStream("C:\\test\\Extr2.txt");
			
			byte[] array = {10, 20, 30};
			
			os.write(array, 1, 2);
			
			os.write(array);
	
			os.close();
		
		
	}

}
