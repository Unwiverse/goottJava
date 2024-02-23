package Exam;

public class ClassExam_04 {
		//멤바변수
		String name;					//이름
		int time;							//작업 시간
		int pay;							//시간당 급여
		
		public ClassExam_04() {}
		public ClassExam_04(String name, int time, int pay) {
			this.name =name;
			this.time =time;
			this.pay =pay;
		} //인자 생성자
		
		//멤버메서드
		//급여 계산 관련 메서드
		void payCal() {
			//총급여액: 일한시간 * 시간당 급여
			int total = time*pay;
			//공제액 = 총급여액 *0.03
			int amount = (int)(total *0.03);
			//실지급액 = 총급여액 - 공제액
			int payable = total - amount;
			
			System.out.println("이름: "+name);
			System.out.printf("총급여: %,d원\n", total);
			System.out.printf("공제액: %,d원\n", amount);
			System.out.printf("실지급액: %,d원\n", payable);
			
		} //paySum() 메서드 end
}
