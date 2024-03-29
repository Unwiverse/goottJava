package generic;
/*
 * 제네릭(generic)?
 * - 포괄적인, 총괄적인, 일반적인
 * - 자바에서 제네릭이란(generic)이란 데이터의 타입(data type)을
 * 	  일반화한다(generalize)는 것을 의미함.
 * 		==> 즉, 자바에서 제네릭은 클래스 내부에서 사용할 데이터
 * 				타입을 외부에서 지정하는 기법을 말함.
 * 				객체별로 다른 타입의 자료가 저장될 수 있게 함.
 * - 모든 종류의 타입을 다룰 수 있도록 클래스나 메서드를 타입 매개변수(generic type)를 이용해 선언하는 기법임.
 * - 특정한 클래스에 원하는 객체 타입을 지정하여 지정된 객체만 저장하게 하는 자바 문법.
 * 
 * - 동일한 프로그램 코드에 다양한 데이터 타입을 적용할 수 있게
 *    클래스와 메서드들을 일반화시켜 제네릭 메서드와 제네릭 클래스를
 *    만들고, 제네릭 메서드나 제네릭 클래스에 개발자가 원하는 데이터 타입을 구체화시켜 
 *    메서드나 클래스의 프로그램 코드를 틀에서 찍어내는 듯이 생산하는 기법임.
 * - 다양한 타입의 객체들을 다루는 메서드나 다음에 학습할 컬렉션에서 컴파일할 때 타입을 확인해주는 기능.
 * 		==> 즉, 다뤄질 객체의 타입을 미리 명시해줘서 번거로운 형변환 작업을 줄여준다는 장점이 있음. 또한 객체
 * 	  타입을 컴파일 시에 체크하며 주기 때문에 객체의 타입 안정성을 높여 준다는 장점도 있음.
 * - jdk 1.5 버전부터 추가된 기능.
 * - 데이터의 명확성과 안정성을 보장해줌
 * 		==> 다른 데이터 타입의 데이터가 들어오면 컴파일 시점에서
 * 				error 발생
 * 
 * ※   <E>: Element를 의미하며 컬렉션에서 요소임을 나타냄.
 *     <T>: Type을 의미함.
 *     <V>: Value를 의미함.
 *     <K>: Key를 의미함.
 */

public class Good<T> {
	private T t;

	public T getT() {
		return t;
	} 

	public void setT(T t) {
		this.t = t;
	}
	
}
