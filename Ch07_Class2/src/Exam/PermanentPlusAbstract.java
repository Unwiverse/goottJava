package Exam;

public class PermanentPlusAbstract extends EmployeePlusAbstract {
		int pay;
		int bonus;
		
		public PermanentPlusAbstract() {}
		public PermanentPlusAbstract(String name, int pay, int bonus) {
			this.name = name;
			this.pay = pay;
			this.bonus = bonus;
			}
		@Override
		int getPays() {
			
			return pay+bonus;
		}
		@Override
		String getName() {
			// TODO Auto-generated method stub
			return name;
		}
		@Override
		void setName(String name) {
			this.name =name;
			
		}
}
