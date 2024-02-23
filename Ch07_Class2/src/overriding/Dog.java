package overriding;

/*
 * 메서드 재정의(method overriding)
 * - 부모 클래스에서 정의한 메서드를 자식 클래스에서
 * 	  자식 클래스에 맞게 다시 작성(재정의)하는 걸 말함.
 * 
 * [메서드 재정의 특징] 
 * 1. 반드시 상속 관계에서만 발생함.
 *     (메서드 다중 정의: 동일한 클래스 내에서 발생)
 * 2. 부모 클래스의 원형 메서드를 자식 클래스에서 재정의(다시 작성).
 * 
 * [메서드 재정의 조건]
 * 1. 반드시 접근지정자, 리턴타입(반환형), 매개변수 개수와 자료형이 모두 일치해야함.
 * (메서드 다중 정의: 매개변수의 개수가 다르거나 개수가 같다면 자료형이 달라야함)
 * 2. 접근 지정자는 확대 가능(축소는 불가)
 * 내 이름은 양상추 근육
 */

public class Dog extends Animal {
		//메서드 재정의
//		void sound() {
//			System.out.println("wall su");
		//}
@Override
void sound() { //Dog 클래스 안에서 ctrl+space 후 선택
	System.out.println("wall su");
	}
}


