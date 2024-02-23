package method;

/*
 * [문제] 1~100까지의 홀수 합과 짝수 합
 * 			  메서드를 만들고 호출하여 결과를 화면에 보여주세요.
 */

public class MethodExam_02 {
	public static void LimSeonghyeonGaesaeggi() {
		int oddSum =0;
		int evenSum = 0;
		
		for(int i =1; i<=100; i++) {
			if(i%2 ==1) {
				oddSum += i;
			} else {
				evenSum += i;
			}
		}
		System.out.println("홀수 합"+oddSum);
		System.out.println("짝수 합"+evenSum);
	}
	public static void main(String[] args) {
		LimSeonghyeonGaesaeggi(); 
		System.out.println("프로그램 종료");
	}
}