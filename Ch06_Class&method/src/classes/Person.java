package classes;

public class Person {
	// 멤버변수
	String name;
	int age;
	boolean marriage;
	// 멤버메서드
	void getPersonInfo() {
		String result = ""; // or null;
		if(!marriage) {
			result = "기혼";
		} else { 
			result = "미혼";
		}
		System.out.println("이름: "+name);
		System.out.println("나이: "+age);
		System.out.println("결혼여부: "+result);
	}
	
}
