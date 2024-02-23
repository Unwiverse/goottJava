package abstracts;

public class Professor extends Person{
	
	String major;
	
	public Professor() {}
	public Professor(String name, String major) {
		this.name=name;
		this.major =major;
	}//인자 생성자
	
	
	//부모 클래스의 추상메서드 재정의
	@Override
	void getInfo() {
		System.out.println(name+" 교수");
		System.out.println(major+" 과목을 강의합니다");
		
		
	}// 메서드 end
	
}
