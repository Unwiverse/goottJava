package goott;
import java.util.Scanner;
/*
 * [문제1] 키보드로부터 점수를 입력받아서 입력 받은 점수가
 * 				60점 이상이면 "합격입니다"라는 메세지를 화면에 출력 하고
 * 				60점 미만이면 "불합격입니다"라는 메세지 출력.
 */

public class IfElseExam_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int grade = sc.nextInt();
		if (grade>=60) {
			System.out.println("합격입니다.");
		}
		else {
			System.out.println("불합격입니다");
		}
		sc.close();
		}

}
