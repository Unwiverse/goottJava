package generic;
// Box클래스 참조
public class GenericExample2 {

	public static void main(String[] args) {
		Box box1 = new Box();
		box1.content = "삼단봉";
		
		Box box2 = new Box();
		box2.content = "일본도";
		
		Box box3 = new Box();
		box3.content = "삼단봉";
		
//		boolean result1 = box1.compare(box2);
		System.out.println(box1.compare(box2));
		
		boolean result2 = box2.compare(box1);
		System.out.println(result2);
		
		boolean result3 = box1.compare(box3);
		System.out.println(result3);
	}

}
