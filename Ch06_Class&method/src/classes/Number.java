 package classes;
/*
 * ★★★★★★★★★★★★★★★★★★★★★★★★
 * 캡슐화(Encapsulation)?
 * - 객체지향 프로그램 4대 특징 중 하나.
 * - 데이터를 감추기, 데이터를 외부에서 함부로 변경하지
 *   못하도록 외부의 접근을 제한하는 방법.
 * - 객체를 캡슐로 싸서 내부를 볼 수 없게 하는 것으로 객체의 
 *   가장 본질적인 특징임.
 * - 예를 든다면 캡슐 약을 생각하면 쉬움. 캡슐에 든 약은 약이 
 *   어떤 색인지, 어떤 성분인지 보이지 않으며, 외부의 
 *   접근으로부터 안전함.
 *   또한 TV에 케이스가 없다면 외부의 접촉으로부터 보호할 수 
 *   없게 됨. 사람이 피부나 근육으로 캡슐화 되어 있지 않다면 
 *   혈관, 장기, 뇌 등이 노출되어 상상하기 조차 싫은 끔찍한 
 *   일이 일어나게 됨.
 * - 객체는 캡슐화가 기본 원칙이지만 외부와의 접속을 위해 몇몇 
 *   부분만 공개 노출하게 됨.
 * - TV는 내부를 캡슐화하고 on/off 버튼, 밝기 조절 버튼, 
 *   채널 버튼, 음량 버튼, 리모컨과 통신하는 부분은 노출을 시킴. 
 * - 정보 은닉 : 클래스 멤버 접근 제어 기법.
 *   * private : 외부에서 직접 접근 차단.
 *   * public : 누구나 접근 가능.
 * - setter() / getter() 메서드로 접근 가능.
 *   ==> setter() : - 지정자 메서드.
 *                  - 멤버변수에 변경할 값을 전달 받아서 
 *                    멤버변수의 값을 변경하는 메서드.
 *   ==> getter() : - 획득자 메서드.
 *                  - 멤버변수의 값을 읽어 와서 호출한 
 *                    곳으로 읽은 값을 넘겨주는 메서드.
 * ★★★★★★★★★★★★★★★★★★★★★★★★
 */

public class Number {
		// 멤버변수 
		private int num1; //private 접근제한 ==> 외부 클래스에서 접근 불가
		private int num2;
//		public int getNum1() {				// Source -> generate setter and getter 메뉴 이용
//			return num1;
//		}
//		public void setNum1(int num1) {
//			this.num1 = num1;
//		}
//		public int getNum2() {
//			return num2;
//		}
//		public void setNum2(int num2) {
//			this.num2 = num2;
//		}													// Source -> generate setter and getter 메뉴 이용
		
		/*
		 * setter() 메서드로 멤버변수에 초기값을 설정.
		 * - private 멤버변수에 값을 지정하는 역할을 하는 메서드.
		 * 
		 * 		형식)
		 * 				public void set 멤버변수형(자료형 매개변수) {
		 * 						멤버변수 = 매개변수
		 * 				}
		 */
		public void setNum1(int num1) { //setter 메소드
			this.num1= num1;
			
		}
		public void setNum2(int num2) { //setter 메소드 
			this.num2= num2;
			
		}
		/*
		 * getter()메소드로 멤버변수에 할당된 값을 가져오는 메소드.
		 * - private 멤버변수에 할당된 값을 가져오는 역할을 하는 메서드.
		 * 	  형식) 
		 * 					public 멤버변수 자료형(반환형) get멤버변수명() {
		 * 								return 멤버변수명;
		 * 					}
		 */
		public int getNum1() {
			return num1;
		}
		public int getNum2() {
			return num2;
		}
}
