package method;

import java.util.Scanner;

public class MethodExam_05_02 {
	public static void DCMC(int o, int p) {
		System.out.println(o);
		System.out.println(p);
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째: ");
		System.out.println();
		System.out.print("두 번째: ");
		System.out.println();
		DCMC(sc.nextInt(), sc.nextInt());
		
		sc.close();
	}

}
