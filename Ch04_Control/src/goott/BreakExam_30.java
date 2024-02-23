package goott;

/*
 * 3. 기타(보조제어문)
 * 		- break 명령어.
 * 		- 현재의 제어문을 빠져나가는 명령어.
 * 		- 보통은 switch~case 문과 반복문에서 사용됨.
 * 		- 반복문에서는 if 문 블럭을 제외한 첫 번째 블럭에서
 * 		  빠져나가는 명령어.
 */

public class BreakExam_30 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) { // if 문 블럭을 제외한 첫 번째 블럭 (==> 포문 start-end 괄호)
			if(i > 50) { 
				break;
			}
			System.out.println("i: "+i);
			
		}
		System.out.println();
		int i = 1, sum=0;
		while(true) { //무한반복
			if(i>100) {
				break;
			}
			sum += i;
			i++;
		}
		System.out.println("sum: "+sum);

} }
