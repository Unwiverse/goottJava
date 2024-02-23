package goott;

import java.io.IOException;

public class FileIO_04 {

	public static void main(String[] args) {
		System.out.println("한 줄을 입력하세요");
		
		while(true) {
				try {
					int num = System.in.read();
					
					if(num == '\n') {
						break;
					}
					
					
					System.out.print((char)num);
					System.in.read();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} //while문 end

	}

}
