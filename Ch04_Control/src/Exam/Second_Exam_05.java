package Exam;

public class Second_Exam_05 {

	public static void main(String[] args) {
		int odd = 0;
		int even = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i%2==1) {
				odd += i;
			}
		 else {
			even -= i;
		}

		}
		System.out.println("hap==> "+(odd+even));
	}
}
