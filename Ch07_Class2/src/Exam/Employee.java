package Exam;

public class Employee {
//		String name;
//		int pay; 
//		
//		
//		public void setName(String name) {
//			this.name = name;
//		}
//		public String getName(String name) {
//			return name;
//
//		}
//		void getPays() {
//			System.out.println("급여: "+pay);
//		}
		
	
	
	//멤버변수
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	//급여를 계산하는 메소드
	// 자식 클래스에서 재정의할 메소드, 
	int getPays() {
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
	
}
