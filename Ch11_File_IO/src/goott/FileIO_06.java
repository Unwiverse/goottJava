package goott;

import java.nio.file.Files;
import java.nio.file.Path;

public class FileIO_06 {

	public static void main(String[] args) {
		var path = Path.of("C:/NCS/workspace(java)/Ch11_File_IO/src/goott/FileIO_05.java");

				try {
					System.out.println(Files.readString(path));
				} catch(Exception e) {
					
				}
				String str =  """
							1. document
							2. Nonprofit
							3. Development
						
									""";
				var path1 = Path.of("C:/NCS/workspace(java)/Ch11_File_IO/src/goott/ESH.txt");

				try {
					System.out.println(Files.writeString(path1, str));
				} catch(Exception e) {
					
				}
	}

}
