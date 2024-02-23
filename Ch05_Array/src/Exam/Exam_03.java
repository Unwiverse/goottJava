package Exam;

//배열 성적처리 

import java.util.Scanner;

public class Exam_03 {

	public static void main(String[] args) {
		//1.키보드 준비 작업
		Scanner sc = new Scanner(System.in);
		
		//2. 키보드로 학생 수를 입력받는다.
		System.out.println("학생 수를 입력하세요: ");
		
		int studentCount = sc.nextInt();
		// 3. 학생의 이름, 국어점수, 영어점수, 수학점수, 평균, 학점, 석차
		String[] names = new String[studentCount];
		int[] kor = new int[names.length];
		int[] eng = new int[kor.length];
		int[] mat = new int[eng.length];
		int[] sum = new int[mat.length];
		double[] avg = new double[sum.length];
		String[] grade = new String[avg.length];
		int[] rank = new int[grade.length];
		//4. 학생 수만큼 이름, 국어점수, 영어점수, 수학점수를
		// 키보드로 입력받아 각각의 배열에 저장해주자.
		for(int i=0; i<rank.length; i++) {
				///// 이름과 각 과목의 점수를 배열에 저장해주자.
				System.out.println("학생의 이름을 입력해주세요: ");
				names[i] = sc.next();
				System.out.println("국어 점수를 입력해주세요: ");
				kor[i] = sc.nextInt(); 
				System.out.println("영어 점수를 입력해주세요: ");
				eng[i] = sc.nextInt(); 
				System.out.println("수학 점수를 입력해주세요: ");
				mat[i] = sc.nextInt(); 
				
				////// 총점과 평균 그리고 학점을 구하자.
				// 총점을 구하자.
				sum[i] = kor[i] + eng[i] + mat[i];
				// 평균을 구하자
				avg[i] = sum[i]/3.0;
				
				//학점을 구하자
				if(avg[i] >=90) {
					grade[i] = "A학점";
				} else if(avg[i] >=80) {
					grade[i] = "B학점"; 
				}else if(avg[i] >=70) {
					grade[i] = "C학점"; 
				}else	if(avg[i] >=60) {
					grade[i] = "D학점";
				}else	if(avg[i] >=50) 
					grade[i] = "F학점"; 
				}
					
		}
	}
	
