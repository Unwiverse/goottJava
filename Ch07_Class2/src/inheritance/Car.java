package inheritance;

/*
 * 상속(inheritance)?
 * - 객체 지향 프로그램 4대 특징 중 하나.
 * - 실세계서 상속은 상위 객체의 속성이 하위 객체에 물려서
 * 	   하위 객체가 상위 객체의 모든 속성을 가지는 개념.
 * - 자바에서의 상속은 자식클래스가 부모클래스의 속성을 물려받고
 * 	  기능을 추가해 확장하는 개념임.
 * - 상속은 슈펴클래스의 필드와 메서드를 물려받아서 코드를 재사용해서
 *    코드 작성에 드는 시간 및 비용 절감 가능
 * - 기존에 이미 잘 만들어진 클래스를 재사용해서 새로운 클래스를 생성하는 자바 문법.
 *   즉, 특정 클래스를 만들 때 기존의 클래스의 데이터(속성)와 기능(메서드)을 그대로 물려받아 중복적인
 *   코드를 없애줌.(클래스 재사용, 코드의 중복을 없애줌)
 * - 자식과 부모의 관계로 형성이 돼있음.
 * --> 부모클래스: super, parent 클래스라고 하기도 함.
 * --> 자식은 부모의 멤버보다 길거나 많다.
 * - 상속의 대상은 멤버(멤버변수, 멤버메서드)
 * --> 단, 생성자나 private 접근 제한을 갖는 멤버변수와 
 * 		  멤버 메서드는 상속에서 제외
 * - 상속 시 사용되는 키워드: extends 
 * - 상속은 단일 상속만 가능함.
 * --> 상속의 장점은 클래스의 수정을 최소화시킬 수 있다는 장점이 있음. 
 *       또한 유지보수의 시간을 최소화시켜 준다는 장점이 있음.
 *       
 *       형식) 
 *       			[접근제한] class 자식클래스명 extends 부모클래스명 {
 *       							=============
 *       			}
 *       
 * - 상속 관계: "~은 이다" ==> is ~ a 관계
 *    포함 관계: "~은 ~을 가진다" ==> has ~a 관계
 *    					==> 사람은(name, id, age)를 가지고 있다.
 *  - 주의사항) 부모클래스는 반드시 기존에 미리 정의돼있어야함. 
 */

// 부모클래스 
public class Car {
		// 멤버변수
		int cc;
		int door;
		
}
