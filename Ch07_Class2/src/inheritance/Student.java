package inheritance;

public class Student extends Person {
		// String juminNo;
		// String name;
		// int age;
		// String job;
		String major;//학과
		public Student() {
//			super();
		} //기본 생성자
		public Student(String juminNo, String name, int age, String job, String major) {//인자 생성자
			//super();
			this.juminNo =juminNo;
			this.name = name;
			this.age = age;
			this.job =job;
			this.major=major;
			
			
			} 
		void getStudentInfo() {
			System.out.println("주민번호: "+juminNo);
			System.out.println("이름: "+name);
			System.out.println("나이: "+age);
			System.out.println("직업: "+job);
			System.out.println("학과: "+major);
		} //메서드 end
		
} 
