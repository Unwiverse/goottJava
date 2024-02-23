package inheritance;

public class Person_03 {

	public static void main(String[] args) {
//		Student student = new Student(); // 객체 생성할 때 기본 생성자가 없으면 에러남.
		Student student = new Student("001101-2234567", "홍길동", 25, "대학생", "영문학과");
		student.getStudentInfo();
		
		System.out.println();
		Employee employee = new Employee();
		employee.juminNo = "740517-1234567";
		employee.name = "홍길동";
		employee.age = 51;
		employee.job = "회사원";
		employee.salary = 1000;
		employee.getEmployeeInfo();
		
	}

}
