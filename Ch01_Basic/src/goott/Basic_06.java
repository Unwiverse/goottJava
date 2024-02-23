package goott;

public class Basic_06 {

	public static void main(String[] args) {
		//System.out.println()
		//System.out.print()
		//System.out.printf()
		
		// %d: 정수 출력 시
		System.out.printf("%d +%d = %d\n", 10, 20, (10+20));
		// %o: 8진수 출력 시
		System.out.printf("8진수는 >>> %o\n", 10); //12 => 1 2
		// %x: 16진수 출력 시
		System.out.printf("16진수는 >>> %x\n", 15);
		System.out.printf("%f\n", 3.2582); // 부동 소수점 숫자를 기본 형식으로 출력
		System.out.printf("%.4f\n", 3.2582); //올림 자동 수행
		System.out.printf("%.3f\n", 3.2582); // 소수점 아래 셋째 자리까지 출력
		System.out.printf("%,d\n", 10000000); // 숫자 구분자 첨부(정수)
	}

}
