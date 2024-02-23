package Exam;

public class Temporary extends Employee{
//		int time;
//		
//		public Temporary () {}
//		public Temporary (String name, int pay, int time) {
//			this.name = name;
//			this.pay = pay;
//			this.time = time;
//		}
//		@Override
//		void getPays() {
//		System.out.println(":::::::::::::::::::::::::::::::::");
//		System.out.println("고용형태: 임시직");
//		System.out.println("이름: "+name);
//		System.out.println("급여: "+(pay*time));
//		}
	
	
	
	//멤버변수
	int time;						//작업 시간
	int pay; 						//시간당 급여
	
	public Temporary() {}
	public Temporary(String name, int time, int pay) {
		this.name = name;
		this.time = time;
		this.pay= pay;
		}
	public int getTime() {
		return time;
	}
	public int getPay() {
		return pay;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	//부모 클래스에서 상속받은 메서드 정의.
	@Override
		int getPays() {
			return pay*time;
		}
}
