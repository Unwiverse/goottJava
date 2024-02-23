package abstracts;

public abstract class SmartPhone {
		
	
	// 멤버변수(스마트폰 공통 기능들) 
	String call = "전화";
	String sns = "문자";
	String search = "검색";
	String game = "게임";
	
	// 각각의 기계(단말기)들의 특성
	String company, name, color, size, weight, price;
	
	void purpose() {
		System.out.println("사용목적: "+call+" / "+sns+" / "+search+" / "+game);
		}
	//각각의 단말기들의 스펙
	abstract void spec();
	}
