package goott;

/* 
 * 다중 for문을 이용해 구구단을 만들어보자.
 */

public class ForExam_28 {

	public static void main(String[] args) {
		for(int dan =2; dan<=9; dan++) { //구구단에서 단
			System.out.println("^^^"+ dan + "단^^^");
			for(int i =1; i<=9; i++) { //구구단에서의 수
				System.out.println(dan+" * "+i+" = "+(dan*i));
				
			} // 안쪽 for문 end
		System.out.println();
		} // 바깥쪽 for문 end
		
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i1= 1; i1<=9; i1++) { //행
			for(int dan1 =2; dan1<=9; dan1++) { //열
				System.out.print(dan1+" * "+i1+" = "+(dan1*i1)+"\t"+"\t");
			}
			System.out.println();
		}

	}

}
