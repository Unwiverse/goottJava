package goott;

/*
 * 3. 기타(보조제어문)
 * 		- continue 명령어.
 * 		- 반복문에서만 사용되는 명령어.
 * 		- 반복문을 활용하는 것이 아니라, 다음 증감식으로 가는 명령어.
 */

public class Continue_31 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				continue; // 홀수일 경우 다음 블럭으로 건너뜀(출력문 실행)
			}
			System.out.println("i:"+i);
		}
		// 1~100까지의 합을 구해보자.
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2 ==1) {
				continue;
			}
			sum += i;
		}
		System.out.println("sum: "+sum);

	}

}
