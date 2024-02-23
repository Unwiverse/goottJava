package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Member;

public class List_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 수를 입력하세요: ");
		
		int memberCount= sc.nextInt();
		
		sc.nextLine();
		List<Member> list = new ArrayList<Member>(); //각 Member 객체 주소값이 생성된 ArrayList 각 인덱스에 들어감
		//1. 키보드로 회원 수 만큼의 회원 정보를 입력받아
		//   ArrayList에 저장해보자.
		for(int i=0; i<memberCount; i++) {
			System.out.println((i+1)+"번째 회원의 아이디, 비번, 이름, 나이, 연락처, 주소 입력: ");
			Member member = new Member(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			list.add(member);
		}
		//회원 정보를 ArrayList에서 가져와서 화면에 출력 ㄱ
		for(int i=0; i<list.size(); i++) {
			Member dto = list.get(i);
			System.out.println(dto.getId()+"\t"+dto.getPwd()+"\t"+dto.getName()+"\t"+dto.getAge()+"\t"+dto.getPhone()+"\t"+dto.getAddr());
			
			System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		}
		sc.close();
	}

}
