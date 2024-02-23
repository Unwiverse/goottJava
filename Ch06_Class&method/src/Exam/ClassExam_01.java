package Exam;

public class ClassExam_01 {
			//멤버변수
			String name;					//이름 
			String gender;					// 성별
			int age;							// 나이
			//생성자
			public ClassExam_01() {}
			public ClassExam_01(String n, String g, int a) {
				name = n;
				gender = g;
				age = a;
			}		// 인자 생성자
			
			//멤버메서드
			void getPersonInfo() {
				String MorF = ""; // String 변수 초기화 
				if(gender.equals("male")) {
					MorF = "남자";
				} else if(gender.equals("female")) {
					MorF = "여자";
				}
				System.out.println("==================");
				System.out.println("이름: "+name);
				System.out.println("성별: "+MorF);
				System.out.println("나이: "+age);
			}
}
