package Object;

/*
 * Object 클래스
 * 1. java의 모든 클래스의 조상 클래스.
 * 2. 사용자가 정의한 클래스에 자동으로 상속이 된다.
 *     ==> 단, extends키워드를 쓰지 않은 클래스에만 상속됨.
 *  [Object 클래스 주요 메서드]
 *  - toString():  객체 자신의 정보(주소값 등)를 문자열로 반환하는 메서드.
 *  					- 인스턴스에 대한 정보를 문자열로 제공할 목적으로 사용됨.
 *  - getClass(): 객체 자신의 클래스 정보(이름)를 담고 있는 class 인스턴스를 반환
 *  					 하는 메서드.
 *  - hashCode(): 객체 자신의 해시코드를 반환하는 메서드.
 *  - equals(): 객체 자신과 또다른 객체가 같은 객체인지 알려주는 메서드.
 *  - clone(): 객체 자신의 복사본을 만드는 메서드.
 */

public class Object_01 { //extends Object 

	public static void main(String[] args) {
		Object_01 object1 = new Object_01(); //자기 자신 클래스에 object1 객체로 접근
		System.out.println("toString(): "+object1.toString());
		System.out.println("getClass():"+object1.getClass());
		System.out.println("hashCode(): "+object1.hashCode());
		System.out.println("equals(): "+object1.equals(object1));

	}

}
