package inheritance;

/*
 * 1. super() 키워드
 * - 자식 클래스에서 부모클래스의 생성자를 호출하는 명령어.
 * 		형식) super(인자); //인자는 생략도 가능.
 * 
 * 2. this() 키워드
 * - 현재(자식) 클래스에서 현재 클래스 안에 있는 다른 생성자를 호출하는 명령어.
 * 		형식) this(인자);
 * 
 * 주의) this() 키워드를 사용할 땐 꼭 생성자 첫 문장에 와야함.
 */

public class Point3D extends Point{
		
	//int x; 
	//int y; // 이미 호출되어 생략된 변수들
	int z;
	
	public Point3D() {
		super();
	} //대괄호 안에 super();가 숨겨져있음
	public Point3D(int x, int y) {
		super(x, y); //Point 클래스의 변수 호출
//		this.x = x;
//		this.y =y;

}
	public Point3D(int x, int y, int z) { //생성자 오버로딩(매개변수 개수가 달라야함)

//		this.x = x;
//		this.y =y;
		this(x, y); //윗 생성자의 x, y 호출
		this.z = z;

	}
	void output() {
		System.out.println("x 좌표: "+x);
		System.out.println("y 좌표: "+y);
		System.out.println("z 좌표: "+z);
	}
	
}
