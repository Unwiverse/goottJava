package packages;

import java.util.Scanner;
import model.Member;

/*
 * [문제] 회원 수를 키보드로 입력받고, 회원 수만큼 회원의 정보도 키보드 입력받아서 
 * 객체 배열에 저장하고 저장된 회원의 정보를 화면에 ㄱ
 */

public class Member_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 su 입력: ");
		Member[] member = new Member[sc.nextInt()];
		sc.nextLine();
		for(int i =0; i<member.length; i++) { //객체 배열의 각 객체 하나당 값을 집어넣어야 함
			member[i] = new Member(); // member 객체 배열마다 주소값 할당
		
			System.out.println("회원 아이디 입력: ");
			member[i].setId(sc.nextLine());
		
			System.out.println("회원 비번 입력: ");
			member[i].setPwd(sc.nextLine());
		
			System.out.println("회원 이름 입력: ");
			member[i].setName(sc.nextLine());
		
			System.out.println("회원 나이 입력: ");
			member[i].setAge(sc.nextLine());
			
			System.out.println("회원 전번 입력: ");
			member[i].setPhone(sc.nextLine());
			
			System.out.println("회원 주소 입력: ");
			member[i].setAddr(sc.nextLine());

		}
		//출력
		System.out.println();
		for(int i=0; i<member.length; i++) {

			System.out.println("회원 아이디: "+member[i].getId());
			System.out.println("회원 비번: "+member[i].getPwd());
			System.out.println("회원 이름: "+member[i].getName());
			System.out.println("회원 나이: "+member[i].getAge());
			System.out.println("회원 전번: "+member[i].getPhone());
			System.out.println("회원 주소: "+member[i].getAddr());
		}
		
		sc.close();
	}
	
}
