package abstracts;

public class Student extends Person{
		String StudNum;
		String major;
		
		public Student() {}
		public Student(String name, String StudNum, String major) {
			this.name=name;
			this.StudNum = StudNum;
			this.major=major;
		}	//인자 생성자
		
		//무보 클래스의 추상 메서드를 재정의한 메서드
		@Override
		void getInfo() {
			System.out.println("학생 학번: "+StudNum);
			System.out.println("학생 이름: "+name);
			System.out.println("학생 학과: "+major);
			
		}	// getInfo() 메서드 end
		
		
		
		
		
}
