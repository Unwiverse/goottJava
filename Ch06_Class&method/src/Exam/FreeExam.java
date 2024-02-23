package Exam;

public class FreeExam {
			int no1;
			int no2;
			int no3;
			int average;
			
		public FreeExam() {}
		public FreeExam(int no1, int no2, int no3) {
			this.no1=no1;
			this.no2=no2;
			this.no3=no3;
			this.average = (no1 + no2 +no3)/3;
			}
	// FreeExam 클래스에서는 전역변수와 기본/인자 생성자만 만듦(초기화)
		
}
