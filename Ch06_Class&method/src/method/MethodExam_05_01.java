package method;

import java.util.Scanner;

public class MethodExam_05_01 {
	
	public static void axxem() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int PI = sc.nextInt();
		
		for(int i=1; i<=100; i++) {
			if(PI<50) {
				System.out.println("이건일");
				
			}	else if(PI==48000) {
				System.out.println("임성현");
			}
			}
		
	}

	public static void main(String[] args) {
		axxem();

	}

}
