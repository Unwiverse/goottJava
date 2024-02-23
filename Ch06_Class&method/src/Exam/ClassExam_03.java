package Exam;

public class ClassExam_03 {
			//멤버변수
			String name;
			String phone;
			String addr;
			String position;

			
			public ClassExam_03() {} //기본 생성자
			public ClassExam_03(String name, String phone, String addr, String position) {	// 인자 생성자
				this.name = name;
				this.phone = phone;
				this.addr = addr;
				this.position = position;
			}
			
			// 멤버메소드
			void getCardInfo() {
				System.out.println("이름: "+name);
				System.out.println("연락처: "+phone);
				System.out.println("주소: "+addr);
				System.out.println("직급: "+position);
				
			} //동작 호출 메서드
}
