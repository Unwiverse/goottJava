package goott;

/*
 * 다차원 배열의 가변 배열
 * - java의 다차원 배열은 행마다 서로 다른 열을 가질 수 있음.
 *   행의 크기를 먼저 결정을 하고, 열의 크기는 가변적으로
 *   할당을 하는 배열임.
 * - 가변 배열을 사용하는 이유 : 메모리 손실을 최소화하기 위함.
 */

public class ArrayExam_10 {

	public static void main(String[] args) {
		
		// 다차원 배열의 가변 배열 선언 및 메모리 생성.
		// 행 : 4행, 열 : 미지정
		int[][] score = new int[4][];
		
		// 가변 배열의 열 메모리 생성.
		score[0] = new int[3];   // 1행 3열
		score[1] = new int[1];   // 2행 1열
		score[2] = new int[2];   // 3행 2열
		score[3] = new int[4];   // 4행 4열
		
		int count = 10;
		
		for(int i=0; i<score.length; i++) {
			
			for(int j=0; j<score[i].length; j++) {
				
				score[i][j] = count;
				
				System.out.print(score[i][j] + "\t");
				
				count += 10;
			}
			
			System.out.println();
		}

	}

}
