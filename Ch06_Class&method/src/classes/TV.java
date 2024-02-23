package classes;

public class TV {
		//멤버 변수
	String color;//tv 색
	boolean power; //tv전원
	int channel; //tv 채널
	
	//멤버메서드
	void power() { //tv전원 메서드
		power = !power; //power 메서드는 true
	} //power() 메서드 end
	
	void channelUp() { // tv 채널을 올리는 메서드
		if(power) {
			channel ++;
		}
	} //channelUp() 메서드 end
	void channelDown() {
		if(power) {
			channel --;
		}
	}
	void display() {
		String status ="";
		if(power) {
			status = "전원 On";
		} else {
			status = "전원 off";
		}
		System.out.println("TV 색상>>>"+color);
		System.out.println("TV 전원>>>"+status);
		System.out.println("TV 채널>>>"+channel);
	}
	
}
