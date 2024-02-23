package classes;

// 돼지 저금통

public class PigSave {
		
	 int balance; //돼지 저금통 잔액

	public PigSave () {}
	public PigSave(int balance) {
		this.balance = balance;

	} //인자 생성자
	
	// 입금을 하는 메서드
	public void deposit(int money) {
		System.out.println("돼지 저금통에 입금을 합니다.");
		
		balance += money; // balance = balance + money;
		System.out.println("현재잔액: "+balance+"원");
	} //deposit() 메서드 end
	
	// 출금하는 메서드
	public void withdraw(int money) {
		if(money > balance) {
			System.out.println("잔액이 부족합니다.");
			return; // 현재 실행되는 메서드 종료 명령어★★★★★★★★
		}
		System.out.println("돼지 저금통에 출금을 합니다.");
		
		balance -= money;
		System.out.println("현재잔액: "+balance+"원");
	}
}
