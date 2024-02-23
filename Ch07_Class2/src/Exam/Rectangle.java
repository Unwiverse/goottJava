package Exam;

public class Rectangle implements Shape{

	int width;
	int height;
	
	public Rectangle() {}
	public Rectangle(int width, int height) {

		this.width = width;
		this.height = height;
	}
	
	@Override
	public double findArea() {
		
		return (width*height);
	}

}
