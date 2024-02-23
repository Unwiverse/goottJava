package classes;

public class TV_02 {

	public static void main(String[] args) {
		TV tv = new TV(); //객체인 tv가 TV클래스에 접근하겠다는 선언
		tv.display(); // default값 출력
		
//		tv.power(); 
		tv.color = "하늘색"; //
		tv.channel = 7; // 초기값 부여
		tv.channelUp(); // 

		tv.display();
		
		tv.power(); //전원을 On 시키는 메서드 호출
		tv.channelUp();
		tv.display();
		
		System.out.println();
		/*
		 * [문제1] TV객체를 만들되 tv1이라는 참조변수를 써서
		 * 				객체를 만들고 아래와 같이 조건에 맞게 실행해 보세요.
		 * 				조건1) 색상: 흰색, 전원: off, 채널:15
		 * 				조건2) tv1 정보를 화면에 출력해보세요.
		 * 				           ==> display() 메서드를 쓰면 됨.
		 * 				조건3) tv1 정보를 다음과 같이 변경해서 화면에 보여주세요.
		 * 							색상: 흰색, 전원 on, 채널 28
		 */
		TV tv2 = new TV();
		tv2.color ="흰색";
		tv2.channel =32;
		tv2.display();
		
		System.out.println();
		
		tv2.color ="검정색";
		tv.power();
		for(int i=tv2.channel; i>11; i--) {
			tv2.channelDown();
		}
		tv2.display();
		
//		TV tv1 = new TV();
//		tv1.color = "흰색";
//		tv.channel = 15;
//		tv.display();
//		
//		System.out.println();
//		
//		tv1.power();
//		for(int i=tv1.channel; i<28; i++) {
//			tv1.channelUp();
//		}
//		tv1.display();
//		System.out.println();
	}

}
