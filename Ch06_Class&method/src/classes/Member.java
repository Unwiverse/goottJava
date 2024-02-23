package classes;
/*
 * [문제]   회원 객체의 멤버를 구성해 멤버에
 * 				인자 생성자로 초기값을 할당 후
 * 				회원 정보를 화면에 보여주세요
 * 				(회원 구성 요소: 아이디, 이름, 나이, 연락처, 직업)
 */

public class Member {
		int id;
		String name;
		int age;
		String phone;
		String job;

void getMemberInfo() {
	System.out.println("아이디: "+id);
	System.out.println("이름: "+name);
	System.out.println("나이: "+age);
	System.out.println("연락처: "+phone);
	System.out.println("직업: "+job);
}	// getStudentInfo() 메서드 end
}

