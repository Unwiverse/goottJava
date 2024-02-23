package Exam;

import java.util.Random;

public class Ran_1 implements RanP{
	int a;
	
	public Ran_1() {}
	public Ran_1(int a) {
		Random random = new Random();
		this.a = random.nextInt(500);
	}
	
	@Override
	public int cal() {
		System.out.println(a);
		return a;
	}

}
