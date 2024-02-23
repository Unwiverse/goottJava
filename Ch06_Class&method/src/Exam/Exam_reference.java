//package Exam;
//
//import java.util.Scanner;
//
//// 학생관리 프로그램 과제
//
//public class Exam_reference {
//
//	public static void input(String[] n, int[] h, String[] m, String[] p, Scanner sc) {
//		for(int i=0; i<n.length; i++) {
//			System.out.println((i+1)+"번째 학생정보 입력");
//			System.out.println("학생 정보 입력: ");
//			n[i] = sc.next();
//			
//			System.out.println("학생 학번 입력: ");
//			h[i] = sc.nextInt();
//			
//			System.out.println("학생 학과 입력: ");
//			m[i] = sc.next();
//			
//			System.out.println("학생 연락처 입력: ");
//			p[i] = sc.next();
//			
//		}
//	}
//	//전체 학생 정보 출력 메소드
//	public static void output(String[] na, int[] ha, String[] ma, String[] ph) {
//		for(int i=0; i<ha.length; i++) {
//			System.out.println("***"+(i+1)+"번째 학생 정보");
//			
//			System.out.println("학생 이름: "+na[i]);
//			System.out.println("학생 학번: "+ha[i]);
//			System.out.println("학생 학과: "+ma[i]);
//			System.out.println("학생 전번: "+ph[i]);
//
//		}
//	}
//	// 학생 정보 조회 메서드
//	public static void search(String[] n, int[] h, String[] m, String[] p, Scanner sc) {
//		System.out.println("조회할 학생의 학번 입력: ");
//		int hakbun = sc.nextInt();
//		for(int i=0; i<p.length; i++) {
//			if(hakbun == h[i]) {
//				System.out.println("조회한 학생 이름: "+n[i]);
//				System.out.println("조회한 학생 학번: "+h[i]);
//				System.out.println("조회한 학생 학과: "+m[i]);
//				System.out.println("조회한 학생 전번: "+p[i]);
//			}
//		}
//		
//	}
//	//학생 정보 수정 메소드
//	public static void modify( int[] h, String[] p, Scanner sc) {
//		System.out.println("수정할 학생의 학번 입력: ");
//		int hakbun = sc.nextInt();
//		for(int i=0; i<p.length; i++) {
//			if(hakbun == h[i]) {
//				
//				System.out.println("조회한 학생 학번: "+h[i]);
//				
//				System.out.println("조회한 학생 전번: "+p[i]);
//	}
//		}}
//	//프로그램 종료 메서드
//	public static String end(Scanner sc) {
//		System.out.println("프로그램 종료 하시겠습니까?");
//		return sc.next();
//	}
//	public static void main(String[] args) {
//			//키보드 준비 작업
//			Scanner sc= new Scanner(System.in);
//			
//			//1. 학생 수를 입력받자.
//			System.out.println("학생 수를 입력받자: ");
//			int StudNum = sc.nextInt();
//			//2. 학생 정보를 저장할 배열 선언 및 메모리 생성
//			String[] names = new String[sc.nextInt()];
//			int[] hakbuns= new int[names.length];
//			String[] majors = new String[hakbuns.length];
//			String[] phones = new String[majors.length];
//			
//			
//			
//			//3.무한반복을 통한 학생관리 프로그램 실행
//			while (true) {
//				System.out.println("1. 학생 등록");
//				System.out.println("2. 전체 출력");
//				System.out.println("3. 학생 조회");
//				System.out.println("4. 정보 수정");
//				System.out.println("5. 프로그램 종료");
//				System.out.println();
//				
//				System.out.println("학생 관리 메뉴 중 하나를 고르세요.");
//				int menu = sc.nextInt();
//				
//				switch(menu) {
//					case 1 : // 학생등록 메뉴
//							//학생 등록 메서드 호출
//							input(names, hakbuns, majors, phones, sc); //sc를 넘기면 메서드 정의할 때도 스캐너 사용 가능
//							break;
//						
//					case 2: //전체 출력 메뉴
//							//전체 출력 메소드 호출
//							output(names, hakbuns, majors, phones);
//							break;
//						
//					case 3: // 학생 조회 메뉴 선택
//							//학생 조회 메서드 호출
//							search(names, hakbuns, majors, phones, sc);
//							break;
//						
//					case 4: // 정보 수정 메뉴 선택
//							// 정보 수정 메소드 호출
//							modify(hakbuns, majors, phones, sc);
//							break;
//						
//					case 5: //프로그램 종료 메뉴 선택	
//							// 프로그램 종료 메소드 호출
//							String result = end(sc);
//							break;
//				} //switch~case문 end
//				String result= " ";
//				if(result.equalsIgnoreCase("Y")) {
//					break;
//				}
//				
//			} //while문 end
//			                      
//
//	}
//
//}
