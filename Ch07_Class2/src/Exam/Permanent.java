package Exam;

public class Permanent extends Employee{
//		int bonus;
//		
//		public Permanent() {}
//		public Permanent(String name, int pay, int bonus) {
//			this.name= name;
//			this.pay = pay;
//			this.bonus= bonus;
//		}
//		@Override
//		void getPays() {
//		System.out.println("::::::::::::::::::::::::::::::::::");
//		System.out.println("고용형태: 정규직");
//		System.out.println("이름: "+name);
//		System.out.println("급여:"+(pay+bonus));
//		}
		
	//멤버변수
	int pay; 						//기본 급여
	int bonus;					//보너스
	
	public Permanent() {}
	public Permanent(String name, int pay, int bonus) {
		this.name = name;
		this.pay =pay;
		this.bonus=bonus;
	}
	public int getPay() {
		return pay;
	}
	public int getBonus() {
		return bonus;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	//부모 클래스에서 상속된 메서드를 재정의
	@Override
		int getPays() {
			//기본급 + 보너스 
			return pay +bonus;
		}
		
}
