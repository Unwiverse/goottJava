package Exam;

import java.util.Random;

public class Ran_2 implements RanP{
	
	int b;
	
	public Ran_2() {}
	public Ran_2(int b) {
		Random random = new Random();
		this.b=random.nextInt(500);
	}

	@Override
	public int cal() {
		
		System.out.println(b);
		return b;
	}

}
