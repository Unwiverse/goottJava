package Exam;
//백준 2884번 문제
import java.util.Scanner;

public class SangGeun {

	public static void main(String[] args) {
		
			
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int time = h*60 +m;
		time -= 45;
		if(time <0) {		// 출력 예시 때문에 넣은 조건
			time += 60*24;
		}
		int rh = time/60;
		int rm = time%60;
		System.out.println(rh);
		System.out.println(rm);

	}
	
	
	}


