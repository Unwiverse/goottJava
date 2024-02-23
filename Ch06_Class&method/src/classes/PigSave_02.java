package classes;

public class PigSave_02 {

	public static void main(String[] args) {
		// 돼지 저금통 객체 생성
		PigSave save = new PigSave(0);
		
		save.deposit(30000);
		save.deposit(40000);
		save.withdraw(40000);
		save.deposit(20000);
		save.withdraw(50000);
		
		//이렇게 접근하면 안됨 ↓↓↓↓↓
		//save.balance = 100000; 
	}

}
