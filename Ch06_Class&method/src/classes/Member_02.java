package classes;

public class Member_02 {

	public static void main(String[] args) {
		Member db = new Member();
		
		db.id = 123123;
		db.name = "derrick";
		db.age = 52;
		db.phone ="01095823013";
		db.job = "소방관";
		db.getMemberInfo();
	}

}
