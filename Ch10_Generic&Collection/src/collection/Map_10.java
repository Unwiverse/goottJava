package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * 3. Map 컬렉션 프레임워크 특징
 * 		- key, value를 많이 한 쌍으로 해서 데이터를 저장하고
 * 		   검색하는 기능을 제공함
 *     - key는 중복 불가, value는 중복 가능.
 *     - Map 인터페이스의 자식 클래스를 이용해 구현.
 *     	  ==> HashMap(O), HashTable(O), Properties(가끔), TreeMap(X)   
 */
public class Map_10 {

	public static void main(String[] args) {
		//Map 인터페이스의 자식 클래스를 이용해 객체 생성.
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//1. put(key, value): map에 데이터를 저장하는 메서드
		// => 이름을 key, 점수를 value로 저장
		
		map.put("홍길동", 62);
		map.put("김원", 71);
		map.put("이건일", 80);
		map.put("정남재", 91);
		map.put("파계승", 100);
		
		//2. get(key):map에 저장된 데이터를 가져오는 메서드.
		// => get(key)메서드를 호출하면 인자(key)에 해당하는 value를 반환함
		System.out.println("김원 점수: "+map.get("김원")+"점");
		System.out.println();
		for(String str :map.keySet())  { //해당 자료구조는 index가 없어서 단축포문 써야됨
		//KeySey(): map 데이터 중에서 key들만 뽑아서 Set 객체로 반환시킴
			System.out.println(str+" 님의 점수: "+map.get(str)+"점");
		}
		System.out.println();
		
		//검색해보자
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색할 사람 이름 입력: ");
		String searchName = sc.next();
		
		if(map.containsKey(searchName)) {
			System.out.println(searchName+" 님의 점수: "+map.get(searchName)+"점");
		} else {
			System.out.println("없다");
		}
		sc.close();
	}
}
