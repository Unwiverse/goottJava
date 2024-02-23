package goott;

/*
 * [공용 ATM 클래스 설계서]
 * - 입금과 출금의 은행 거래사 가능한 ATM 공용 클래스 설계
 * - 계좌잔액: private int balance;
 * - 생성자: 계좌잔액(balance) 초기화
 * - deposit(): 외부 클래스에서 입금하는 메서드.
 * 		예) balance = balance +money; //잔액에 입금액 더하기
 * 				출력문: 00,0000을 입금해서 00,000원 남음.
 * - withdraw(): 외부 클래스에서 출금하는 메서드.
 * 예) balance = balance -money //잔액에서 출금액 차감.
 * (단, balance < money인 경우, "잔액이 부족합니다."란 메세지 출력) 
 */

/*
 * syncronized 키워드
 * - 스레드 동기화와 관련된 명령어.
 * - 멀티 스레드에 의해서 공유된 메서드나 클래스를 대상으로 임계영역(critical section)을 설정.
 * - 임계 영역으로 설정된 메서드에서는 가장 먼저 도착한 스레드가 
 *    완전히 종료될 때까지 나머지 스레드는 대기하는 명령어.
 * -  공유되는 자원은 대부분 static 키워드를 가진 객체나 메서드를 말함.
 */

class ATM {
	private int balance;
	
	public ATM() {}
	
	public ATM(int balance) {
		this.balance = balance;
	}//인생
	
	//입금 메서드
	public synchronized void deposit(int money) { //synchronized 키워드
		balance += money; //balance = balance+money;
		System.out.println(Thread.currentThread().getName()+" 님이"+money+"원을 입금해 "+balance+"원이 남았어요");
	}
	
	//출금 메서드
	public synchronized void withdraw(int money) { //synchronized 키워드
		if(balance < money ) {
			System.out.println("잔액이 부족합니다");
			return;	//현재 실행 중인 메소드 종료 명령어.
		}
		balance -= money; //balance = balance-money;
		System.out.println(Thread.currentThread().getName()+" 님이"+money+"원을 출금해 "+balance+"원이 남았어요");
		
		
	}
}	//ATM 클래스 end

//스레드 구현 클래스
class User extends Thread {
	ATM atm; //ATM 클래스를 필드멤버로 가짐
	
	public User () {}//기생
	
	public User(ATM atm, String name) {//인생
		super(name); //Thread 클래스(부모) 인자 생성자를 가져옴.
		this.atm = atm;
	}
	@Override
	public void run() {
		atm.deposit(20000);
		atm.withdraw(30000);
	}
}

public class Thread_07 {

	public static void main(String[] args) {
		ATM atm = new ATM(0);
		//User 클래스를 대상으로 멀티스레드 객체 생성.
		User user1 = new User(atm, "정남재");
		User user2 = new User(atm, "엄승현");
		User user3 = new User(atm, "홍지연");
		User user4 = new User(atm, "김세진");
		user1.start();
		user2.start();
		user3.start();
		user4.start();
	}

}
