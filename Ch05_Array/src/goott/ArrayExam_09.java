package goott;

/*
 * 다차원 배열
 * - 1차원 배열이 여러 개 묶여 있는 형태의 배열을 말함.
 * - 행과 열의 개념이 적용이 됨.
 */

public class ArrayExam_09 {

	public static void main(String[] args) {
		
		// 다차원 배열 선언 및 메모리 생성.
		int[][] arr = new int[3][4];  // 3행4열 2차원배열
		
		int count = 10;
		
		System.out.println("arr 배열 길이 >>> " + arr.length);
		
		for(int i=0; i<arr.length; i++) {   // 행
			
			for(int j=0; j<arr[i].length; j++) {   // 열
				
				arr[i][j] = count;
				
				count += 10;  // count = count + 10;
				
				System.out.print("arr["+i+"]["+j+"] >>> "+arr[i][j] +"\t");
			}
			
			System.out.println();
		}
		
	}

}
