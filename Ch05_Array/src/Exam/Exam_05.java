package Exam;

public class Exam_05 {

	public static void main(String[] args) {
		//1. 다차원 배열 선언 및 메모리 할당.
		int[][] array = new int[5][5];
		
		int count= 1;
		//2. 5행 5열 다차원 배열에 데이터를 저장해보자.
		
		for(int i=0; i<array.length; i++) { //고정 - 열
			for(int j=0; j<array[i].length; j++) { //변동 - 행
				array[j][i] =count++;
			}
		}
		//3. 저장된 다차원 배열을 화면에 출력하자.
		for(int i=0; i<array.length; i++) { //고정 - 열
			for(int j=0; j<array[i].length; j++) { //변동 - 행
			System.out.print(array[i][j]);							
			}
		}
		}
	}


