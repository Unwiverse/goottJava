package singleton;

public class Member_01 {

	public static void main(String[] args) {
		// Member 클래스 객체 생성(기존)
//		Member member1 = new Member();
//		Member member2 = new Member();
//		Member member3 = new Member();
//		Member member4 = new Member();
//		Member member5 = new Member();
//		Member member6 = new Member();
		
		Member member1 = Member.getInstance(); //static 변수 호출방법 => 클래스명.getInstance();
		Member member2 = Member.getInstance(); //static 변수 호출방법, member1, 2에는 주소값이 저장된다.
		System.out.println("member1 주소: "+member1);
		System.out.println("member1 주소: "+member2);
		
	}

}
