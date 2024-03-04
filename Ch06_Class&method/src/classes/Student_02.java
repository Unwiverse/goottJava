package classes;

public class Student_02 {

	public static void main(String[] args) {
		// 기본 생성자로 객체를 생성하는 방법.
		Student student= new Student();
		
		student.hakbun = 18956723;
		student.name = "엄승현";
		student.major = "gis공학과";
		student.phone = "01050028033";
		student.addr = "양평군";
		
		System.out.println();
		
		//인자 생성자로 객체를 생성하는 방법.
		Student student2 = new Student(0222221, "세종대왕", "국무낙과", "01090199152", "서울시 중구");
		//student.getStudentInfo();
		student2.getStudentInfo();
		
	}

}
