package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_03 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		/*
		 * Iterator 객체
		 * - 원래 의미: 뭔가 많이 모여 있는 것들을
		 * 	  순서대로 지정하면서 전체를 검색하여 처리를 실행하는 객체.
		 * - 단어의 뜻은 '반복하다'란 의미.
		 *    ==> 자바의 프레임워크에서 컬렉션에 저장되어있는 데이터들을 
		 *    			읽어오는 방법을 표준화해놓은 객체.
		 *    
		 *     ※ 주요 메서드
		 *     hasNext()
		 *     next()
		 *   
		 */
		Iterator<Integer> it= list.iterator();
		/*
		 *hasNext(): 반복하면서 읽어올 데이터가 있는지 확인하는 메서드.
		 *					 boolean형으로 반환됨.
		 *					 다음에 읽어올 데이터가 있으면 true 값을 반환.
		 *					 없으면 false 값 반환.
		 */
		while(it.hasNext()) {
			System.out.println(it.next());
			
			/*
			 * next(): - 데이터를을 가져오는 메서드.
			 * 				- next()메서드를 호출했을 때 정확하게 다음 요소를 반환하도록 
			 * 				  내부 상태를 다음으로 진행시켜두는 역할이 숨어있음.
			 */
		}

	}

}
