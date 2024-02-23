package Exam;

public class TemporaryPlusAbstract extends EmployeePlusAbstract{
		int time;
		int pay;
	
	public TemporaryPlusAbstract() {}
	public TemporaryPlusAbstract(String name, int time, int pay) {
		this.name = name;
		this.time =time;
		this.pay = pay;
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
	//부모 추상화 클래스에서 받은 추상메서드 재정의
	@Override
	int getPays() {
		
		return pay*time;
	}
	@Override
	String getName() {
	
		return this.name;
	}
	@Override
	void setName(String name) {
		this.name= name;
		
	}

}
