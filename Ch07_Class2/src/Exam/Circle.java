package Exam;
import java.lang.Math;
public class Circle implements Shape{
	int r;

	public Circle() {}
	public Circle(int r) {
		
		this.r = r;
	}
	@Override
	public double findArea() {
		return (Math.PI*r*r);
	}
}