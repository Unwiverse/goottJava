package Object;

/*
 * toString() 메서드 재정의
 * - Object 클래스에서 상속받은 메서드를 유요한 정보가
 * 	  반환되도록 재정의하는 걸 말함.
 * - 해당 클래스의 멤버변수가 정보를 갖고 있는데 갖고 있는
 *    데이터에 올바른 값이 담겼는지, 혹은 틀린 데이터가 담겼는지
 *    확인을 하고 싶은 경우에 toString() 메서드를 재정의해서 값 확인 가능.
 */

public class Student {
	
	//멤버변수
		String name;
		String studNo;
		String major;
		String phone;
		String addr;

	public Student() {}
	public Student(String name, String studNo, String major, String phone, String addr) {
		this.name =name;
		this.studNo = studNo;
		this.major = major;
		this.phone= phone;
		this.addr = addr;
	}
	
	@Override
	public String toString() { //source -> generate toString()... 클릭으로 생성
		return "Student [name=" + name + ", studNo=" + studNo + ", major=" + major + ", phone=" + phone + ", addr="
				+ addr + "]";
	}
	
	//void getStudentInfo() {
		//System.out.println("학생 이름: "+name);
		//System.out.println("학생 학번: "+studNo);
		//System.out.println("학생 학과: "+major);
		//System.out.println("학생 전번: "+phone);
		//System.out.println("학생 주소: "+addr);
	//}
	

}
