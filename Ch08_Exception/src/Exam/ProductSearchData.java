package Exam;

public class ProductSearchData { //구현 클래스
	
	//다차원 배열 선언
	String[][] ProTable;
	
	
	public ProductSearchData() {//기본생성자 ※ 클래스 대상 객체 생성 기능을 하고 있다.
		String[][] s = {{"세탁기", "드럼세탁기최신형"}, {"냉장고", "지펠냉장고최신형"}, {"TV", "최신모델"}};
		this.ProTable = s;
	// this.Protable = new String[][] {{"세탁기", "드럼세탁기최신형"}, {"냉장고", "지펠냉장고최신형"}, {"TV", "최신모델"}}; 
		
		
		

	}
	
	String search(String str) { //반환형을 가진 멤버메서드
		for(int i =0; i<=2; i++) {
			if(ProTable[i][0].equals(str)) {
				return ProTable[i][1];
			}
		}
		return null;
	}
	

}
