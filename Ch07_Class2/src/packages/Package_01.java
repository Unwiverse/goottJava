package packages;

import model.Member;
import java.util.*;

/*
 * 패키지(package)
 * - 서로 연관성이 있는 클래스들과 인터페이스들의 묶음을 말함.
 * - 패키지는 물리적으로 폴더 개념과 유사함.
 *   패키지는 서브 패키지를 가질 수 있으며, "."으로 구분함.
 *   import 키워드: 현재 패키지 클래스에서 다른 패키지에 있는
 *   						  다른 클래스를 사용하고 싶은 경우 import
 *   						  해야 함.(단, 동일한 패키지에 있는 다른 클래스를 사용할 땐 생략 가능)
 *   
 *   
 *   형식) import 패키지명.서브 패키지명.클래스명;
 *   
 *   - import 단축키: ctrl+shift+o
 */

public class Package_01 {

	public static void main(String[] args) {
		// model 패키지에 있는 member 클래스를 사용하고 싶을 때
		Member member = new Member();
		
		//회원의 정보를 저장해보자
		member.setId("hong");
		member.setPwd("1234");
		member.setName("홍길동");
		member.setAge("26");
		member.setPhone("010-1111-2222");
		member.setAddr("서울시 구로구");
		
		//출력
		System.out.println("회원 아이디: "+member.getId());
		System.out.println("회원 비번: "+member.getPwd());
		System.out.println("회원 이름: "+member.getName());
		System.out.println("회원 나이: "+member.getAge());
		System.out.println("회원 전번: "+member.getPhone());
		System.out.println("회원 주소: "+member.getAddr());
		double num = 3.4;
		System.out.println(Math.ceil(num));

	}

}
