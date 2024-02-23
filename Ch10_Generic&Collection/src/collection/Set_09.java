package collection;

import java.util.*;




/*
 * 2, Set 계열의 컬렉션 프레임워크 특징
 * 		- 자료 순서가 없음(index가 없음 - 정렬기능 없음)
 * 		- 중복 데이터 허용 불가.
 * 		- Set 인터페이스의 자식 클래스를 이용하여 구현.
 * 			==> HashSet(O), TreeSet(X)
 */

public class Set_09 {

	public static void main(String[] args) {
		
		//Set 인터페이스의 자식 클래스로 객체를 생성
		Set<Integer> set = new HashSet<Integer>();
		// 1. add("값"): 데이터를 추가하는 메서드.
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400); //중복데이터
		set.add(400); //중복데이터
		
		//2. size(): set의 크기를 정수값으로 반환하는 메서드.
		System.out.println("set 컬렉션 크기: "+set.size()); //중복 데이터 중 하나는 허용안함
		
		System.out.println();
		/*
		 * List와 달리 인덱스 정보가 없어서 일반적으로 for문을 써서 데이터를 출력 불가
		 * 이런 Set의 모든 데이터를 하나씩 꺼내기 위해선 Iterator<E> 객체가 필요함.
		 */
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println("set 데이터: "+it.next());
		}
	}

}
