package goott;
import java.util.Scanner;
/*
 * [문제3] 키보드로부터 입력받은 정수가 5의 배수면
 * 				'이 정수는 5의 배수입니다.' 라는 메세지를 화면에 출력하고
 * 				아니면 '이 정수는 5의 배수가 아닙니다.'라는 메세지를 출력.
 * 				단, 입력받은 정수가 음수인 경우에는 '음수가 입력됐습니다.' 라는 메세지를 출력.
 */

public class IfElseExam_09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		long num = sc.nextLong();
		if(num>0) { // 조건이 참인 경우 == > 양수인 경우, 먼저 확인할 사항, 아래 두 조건의 상위 전제
			if((num%5)==0) { // 조건이 참일때: 5의 배수인가? 참이면 아래의 실행문 출력
				System.out.println("입력 받은 " +num+"은 5의 배수입니다.");
			}
			else { // 조건이 거짓일 때: 5의 배수가 아닌가? 거짓이면 아래 실행문 출력
				System.out.println("입력 받은 "+num+"은 5의 배수가 아닙니다.");
			}
		 				 }
		else { // 조건이 거짓인 경우 ==>  음수이거나 0인 경우. 아래 두 조건의 상위 전제.
				if(num==0) { //조건이 거짓일 때: 입력한 숫자가 0인가? 0이면 아래의 실행문 출력
					System.out.println("0을 입력하면 안됩니다.");
				}
				else { // 조건이 거짓일 때: 입력한 숫자가 음수인가? 음수면 아래 실행문 출력
					System.out.println("음수가 입력됐습니다.");
				}
				sc.close();
				}
	}
	}
		

	
	
			
		
		

	
		
