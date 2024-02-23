package singleton;

public class Member {
		private static Member instance = null; //클래스 멤버변수 초기화, static 뜻: 메서드나 변수 공유 시 부여하는 키워드 
		//클래스(명) 타입의 멤버변수 instance 선언
		
		//기본생성자 숨어있음
		private Member() {} //외부에서 기본생성자를 직접적으로 접근하지 못하게 함.
		
		public static Member getInstance() { //instance멤버변수 재정의하는 생성자, static 반환타입 맞춰주기
			
			if(instance == null) { 
				instance = new Member(); //Member instance = new Member();
			} //생성자 end
			return instance; //주소값 리턴
		} //getInstance() 메서드 end
}
