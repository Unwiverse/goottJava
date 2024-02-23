package generic;
//실행 클래스: GenericExample2 
public class Box<T> {
		public T content; //클래스 필드에 선언된 멤버변수 content
		
		public boolean compare(Box<T> other) { //compare 메소드는 클래스를 변수화한 other에 값을 받아 content.equals(other.content);를 
			//수행하고 result에 저장함.
			boolean result = content.equals(other.content);
			return result;
			
		}

		
}
