package Exam;

import java.util.Scanner;

public class Exam_01_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		double Assem, Kotlin, Java, Python;
		
		while(true) {
			System.out.print("이름: ");
			name = sc.next();
			
			System.out.print("어셈블리 점수: ");
			Assem = sc.nextDouble();
			if (Assem<0) {
				System.err.println("음수는 입력 못합니다.");
				continue;
			}
			
			System.out.print("코틀린 점수: ");
			Kotlin = sc.nextDouble();
			if (Kotlin<0) {
				System.err.println("음수는 입력 못합니다.");
				continue;
			}
			
			System.out.print("자바 점수: ");
			Java = sc.nextDouble();
			if (Java<0) {
				System.err.println("음수는 입력 못합니다.");
				continue;
			}
			
			System.out.print("파이썬 점수: ");
			Python = sc.nextDouble();
			if (Python<0) {
				System.err.println("음수는 입력 못합니다.");
				continue;
			
			} break;
		}
			double total = (Assem+Kotlin+Java+Python);
			System.out.println("이름: "+name);
			System.out.println("어셈블리 점수: "+Assem);
			System.out.println("코틀린 점수: "+Kotlin);
			System.out.println("자바 점수: "+Java);
			System.out.println("파이썬 점수: "+Python);
			System.out.println("총합: "+total);
			System.out.println("평균: "+(total/4));
			
			sc.close();
		}
		
	}

