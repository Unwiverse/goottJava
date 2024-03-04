package classes;

public class Person_02 {

	public static void main(String[] args) {
		Person person = new Person();
		person.getPersonInfo();
		System.out.println();
		person.name = "강감찬";
		person.age = 27;
		person.marriage = true;
		person.getPersonInfo();
		
	}

}
