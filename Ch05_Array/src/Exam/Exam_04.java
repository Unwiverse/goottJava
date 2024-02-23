package Exam;

public class Exam_04 {

	public static void main(String[] args) {
		//1. 다차원 배열 선언 및 메모리 할당.
		int[][] array = new int[5][5];
		
		int count= 1;
		//2, 5행 5열 다차원 배열에 데이터 저장(다차원 배열에는 다중for문 필수)
		for(int i=0; i<array.length; i++) { //바깥 루프(고정) - 행
			for(int j=0; j<array[i].length; j++) { // 안쪽 루프(여기서 값이 변동됨) -열, array[i]는 i 번째 행을 의미함.
				array[i][j] = count++; // 선 출력 후 대입
				//count += 1; 
				
			   }
			}
		for(int i=0; i<array.length; i++) { //바깥 루프(고정) - 행
			for(int j=0; j<array[i].length; j++) { // 안쪽 루프(여기서 값이 변동됨) -열, array[i]는 i 번째 행을 의미함.
				System.out.print(array[i][j]+"\t");
	}System.out.println();
}
		}
	}

	