package goott;

// for 반복문을 사용해 1~100의 짝수합과 홀수합을 구해보자.

public class ForExam_24 {

	public static void main(String[] args) {
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

}
