package goott;

// while 반복문을 써서 1~10 까지의 합을 구해보자.

public class WhileExam_17 {

	public static void main(String[] args) {
		//1. 변수 선언
		int i = 1;				// 초기화값
		int sum = 0;       // 1~10까지 합을 저장할 변수
		
		while(i <= 10) {
			sum = sum + i;
			i++;
			
		}
		System.out.println("1~10까지의 합>>>"+sum);
	}

}
