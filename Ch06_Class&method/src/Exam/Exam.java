package Exam;

import java.util.Scanner;

public class Exam {
	static Scanner sc = new Scanner(System.in);
	static int idx = 0;
	static void addStudent(String[] name, int[] id, String[] cl) {
		System.out.println("이름: ");
		name[idx] = sc.next();
		System.out.println("학번: ");
		id[idx] = sc.nextInt();
		System.out.println("학과: ");
		cl[idx] = sc.next();
		idx++;
	}
	public static void outro(String[] name, int[] id, String[] cl) {
		for(int i=0; i<idx; i++) {
		System.out.println("이름: "+name[i]);
		System.out.println("학번: "+id[i]);
		System.out.println("학과: "+cl[i]);
		}
	}
	public static void find(String[] name, int[] id, String[] cl) {
		System.out.println("검색할 학번: ");
		int search = sc.nextInt();
		for(int i=0; i<id.length; i++) {
			if(search==(id[i])) {
				System.out.println("이름: "+name[i]);
				System.out.println("학과: "+cl[i]);
			}
		}
	}
	public static void revoke(int[] id, String[] cl) {
			System.out.println("수정할 학번: ");
			int search = sc.nextInt();
			if(search==(id[idx])) {
				System.out.println("다른 학과 입력: ");
				cl[idx] = sc.next();  
				}
			System.out.println("수정된 학과: "+cl[idx]);
	}
	public static void continueorstop() {
		
	}
	public static void main(String[] args) {
		
		System.out.print("학생 수: ");
		int studNum = sc.nextInt();
		
		String[] names = new String[studNum];
		int[] Sudi = new int[studNum];
		String[] major = new String[studNum];
		
		while(true) {
		addStudent(names, Sudi, major);
		outro(names, Sudi, major);
		find(names, Sudi, major);
		revoke(Sudi, major);
		continueorstop();
		
		System.out.println("계속 진행할까요?(Y or N) : ");
		String res = sc.next();
		if(res.equals("N")) {
			break;
			
		}sc.close();
		
	}System.out.println("끝");
	

}
}