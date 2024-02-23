package collection;


import java.util.*;

/*
 * 컬렉션 프레임워크
 * - 컬렉션의 사전적 의미: 수집해서 모으다, 저장한다는 의미.
 * - 자바에서 배열은 여러 개의 데이터를 다루는데 편리한 자료구조이긴한데
 * 	  삽입과 삭제가 빈번하고, 데이터 크기 예측이 불가능해 응용 프로그램에서는 쓰기 어렵다.
 *    예를 들어 많은 사람의 이름과 전번을 저장하고 삽입, 삭제가 빈번한 전화번호구 관리 프로그램에서
 *    배열을 사용한다면 프로그램 작성에 어려움을 겪게 됨.
 * -  자바에서의 컬렉션은 데이터 추가, 삭제, 수정, 검색 등을
 * 	   효과적으로 제공해주는 자료구조 관련 클래스임.
 *     --> 값을 담을 수 있는 그릇을 의미함(컨테이너 개념)
 * - java.util 패키지에 포함돼있음.
 * - 인터페이스를 통해 정형화된 방법으로 다양한 컬렉션 클래스를 이용.
 * 
 * - 컬렉션 프레임워크.
 * 	  1) 컬렉션을 표준화해서 설계해놓은 인터페이스.
 *   2) List 계열, Set 계열, Map 계열
 *   
 * - 컬렉션의 특징
 *   1) 컬렉션은 제네릭(generic)이라는 기법으로 만들어졌음
 *       컬렉션 클래스의 이름에는 <E>, <K>, <V> 등이 항상 포함돼있음.
 *       이들을 타입 매개변수라고 함. 해당 위치에 구체적인 타입을 명시해 해당
 *       타입만 저장 가능.
 *  2) 컬렉션의 요소는 객체들만 사용이 가능함. 일반 기본 타입의 자료형은 컬렉션 요소로 사용 불가.
 *  
 *   
 *   ////////////////////////////////중요!///////////////////
 *   1. List 계열의 컬렉션 프레임워크 특징
 *   	- 자료의 순서가 보장(index가 있음): 정렬 기능 제공.
 *     - 중복 데이터 허용
 *     - List 인터페이스의 자식클래스로 구현
 *     	  --> ArrayList(O), LinkedList(가끔)
 *     			Vector(가끔 - 멀티스레드에서 특화돼있음)
 *     - 특히 DB에 데이터를 레코드 단위로 저장하거나
 *       저장된 데이터를 가져올 경우에 많이 씀.
 *   ////////////////////////////////중요!///////////////////
 */

public class List_02 {

	public static void main(String[] args) {
		//List 계열 컬렉션 객체 생성.
		List<String> list = new ArrayList<String>();//타입 선언 String만 받음
		//1. add(): 데이터를 추가해주는 메소드.
		list.add("홍길동");
		list.add("세종대왕");
		list.add("유관순");		//중복 데이터
		list.add("이순신");
		list.add("신사임당");
		list.add("유관순");		//중복 데이터(같은 주소값 보유)
		
		System.out.println(list);
		
		//2. size(): 데이터의 크기를 정수값으로 반환해주는 메서드.
		System.out.println(list.size());
		
		//3. get(index): ArrayList에 저장돼있는 데이터를 가져와서 출력해주는 메서드.
		System.out.println("list[1] 데이터: "+list.get(1));
		
		//ArrayList에 있는 모든 데이터를 화면에 출력해보자.
		for(int i=0; i<list.size(); i++) {
			System.out.println("list["+i+"]: "+list.get(i));
			
		}
		//4. clear(): ArrayList의 모든 데이터를 삭제하는 메서드.
		list.clear();
			System.out.println(list.size());
			
		//5. isEmpty(): ArrayList가 비어있는지 아닌지를 체크하는 메서드.
		// 					 ==> 반환형은 boolean 타입.
		System.out.println("list empty?: "+list.isEmpty());
		
		list.add("홍길동");
		list.add("세종대왕");
		list.add("유관순");		//중복 데이터
		list.add("이순신");
		list.add("신사임당");
		list.add("유관순");		//중복 데이터(같은 주소값 보유)
		
		//6. remove(index): ArrayList의 특정 요소(index)를 제거하는 메소드.
		//								 다음 index부터 index값이 한 칸씩 당긴다.
		list.remove(2);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("list["+i+"]: "+list.get(i));
		}
		System.out.println();
		
		//7. add(index, element(값))
		//		==> ArrayList의 특정 index에 데이터를 추가하는 메서드.
		//				해당 index에 추가가 되고, 기존에 있던 데이터들은
		// 			index가 뒤로 하나씩 밀림.
		list.add(2, "강감찬");
		System.out.println(list);
		
		
	}		

}
