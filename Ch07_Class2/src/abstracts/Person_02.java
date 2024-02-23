package abstracts;

public class Person_02 {

	public static void main(String[] args) {
		Student student = new Student("14101549", "김지수", "드론공간정보공학과");
		Professor professor = new Professor("김의명", "드론공간정보공학과");
		student.getInfo();
		System.out.println();
		professor.getInfo();
	}

}
