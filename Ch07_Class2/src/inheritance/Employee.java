package inheritance;

public class Employee extends Person {
			// String juminNo;
			// String name;
			//int age;
			//String job;
			int salary; //월급
			//public Employee() {} //이 행에 기본생성자 생성돼있음
			void getEmployeeInfo() {
				System.out.println("주민번호: "+juminNo);
				System.out.println("이름: "+name);
				System.out.println("나이: "+age);
				System.out.println("직업: "+job);
				System.out.println("급여: "+salary+"만원");
			} //메서드 end
	
}
