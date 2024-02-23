package Exam;

public class Second_Exam_04 {

	public static void main(String[] args) {
//		for(char alpha ='Z'; alpha>='A'; alpha--) { //행
//			for(char beta= 'A'; beta<=alpha; beta++) {
//				System.out.print(beta);
//			}
//			System.out.println();
//		}
//
//	}
		for(int i =90; i>=65; i--) { //행 //유니코드 사용(int로)
			for(char j= 65; j<=i; j++) {
				System.out.print((char)j);
			}
			System.out.println();
		}

	}

}
