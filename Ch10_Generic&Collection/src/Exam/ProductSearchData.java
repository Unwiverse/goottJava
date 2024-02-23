package Exam;

import java.util.HashMap;
import java.util.Map;

public class ProductSearchData {
	//상품명과 상품 정보가 들어갈 Map 자료구조 선언.
	Map<String, String> map;
	public ProductSearchData() {
		
		map = new HashMap<String, String>();
		
		//데이터들을 map에 저장
		//상품명 = key, 모델명 =value
		map.put("세탁기", "드럼 세탁기 최산형");
		map.put("냉장고", "지펠 냉장고 최신형");
		map.put("에어컨", "개시원한 최신 모델");
	} //기본 생성자
	
	//상품명을 매개변수로 받아서 해당 상품명이 Map의 키에 존재하는지 여부 확인해서 존재하면 상품 정보를 반환
	// 하는 메서드
	String search(String productName) {
		if(map.containsKey(productName)) {
			 return map.get(productName);
		} else {
			return null;
		}
	}
}
