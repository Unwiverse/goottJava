package method;

import java.util.Scanner;

/*[문제] 키보드로 입력받은 수까지의 홀수 합과
 * 				짝수합을 구하는 메서드를 만들고 호출해서 출력
 */

public class MethodExam_05 {
	public static void arcturus( ) {
		Scanner sc = new Scanner(System.in);
		int oddSum = 0;
		int evenSum = 0;
		System.out.println("입력: ");
		int num = sc.nextInt();

		
		for(int i=1; i<=num; i++) {
			if(i%2==1) {
				oddSum =oddSum+ i;
			}
			else {
				evenSum =evenSum+ i;
			}
			}
		System.out.println("홀수 합: "+oddSum);
		System.out.println("짝수 합: "+evenSum);
		sc.close();
		}
		
	public static void main(String[] args) {
		arcturus(); //키보드로 데이터를 입력받아 사용 가능 (sc.nextInt());
		}			
}
