package inner;

/*
 * 다양한 형태의 클래
 * 1. 일반적인 선언 방법
 *     ==> 하나의 java파일에 class 키워드를 작성하여
 *     			클래스 선언. 
 * 2. 무명 클래스(annoymous class) 선언
 * 		==> 이름이 없는 클래스 선언
 * 				interface를 객체 생성 시 많이 쓰임.
 * 3. 중첩 클래스(inner class) 선언
 * 		==> 클래스 안에 또다른 클래스 선언.
 */

public class Inter_01 {

	public static void main(String[] args) {
			//1. 일반적인 객체 생성 방법
			Sub sub = new Sub();
			System.out.println("sum() 메서드 호출: "+sub.sum(200, 36));
			System.out.println("sum() 메서드 호출: "+sub.minus(200, 36));
			
			//2. 무명 클래스(annonymous class) 선언
			Inter inter = new Inter() { //생성 방법: 객체 선언 후 오류 전구 클릭 후 생성
				
				@Override
				public int sum(int n1, int n2) {
					// TODO Auto-generated method stub
					return n1+n2;
				}
				
				@Override
				public int minus(int n1, int n2) {
					// TODO Auto-generated method stub
					return n1-n2;
				}
			};

	
			
			System.out.println("interface sum(): "+inter.sum(300, 237));
			System.out.println("interface sum(): "+inter.minus(500, 238));

	}

}
