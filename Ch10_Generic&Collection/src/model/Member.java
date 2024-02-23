package model;

/*
 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
 * 자바 빈(Java Bean)
 * - DB에 접근해 테이블의 특징 컬럼에 값을 저장하거나
 *    저장된 값을 가져올 때 사용하는 클래스.
 * - Java Bean == DTD(Data Transfer Object) == VO(Value Object)
 * - 구성 요소
 *  	1. 멤버변수 - DB 컬럼명: 접근지정자(private)
 *  	2. setter(): 데이터를 멤버변수에 저장하는 메서드.
 *  	3. getter(): 멤버변수에 저장된 데이터를 가져오는 메서드.
 */

public class Member {
	 /*
	  * 만약 DB 상의 테이블의 이름이 member(회원 테이블)이라고 
	  * 가정 했을 때 member 테이블의 구성(컬럼)이
	  * id, pwd, name, age, phone, addr로 구성이 돼있다고 가정하면
	  */
	//멤버변수
	private String id;
	private String pwd;
	private String name;
	private String age;
	private String phone;
	private String addr;
	
	public Member() {}
	public Member(String id, String pwd, String name, String age, String phone, String addr) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.addr = addr;
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	public String getName() {
		return name;
	}
	public String getAge() {
		return age;
	}
	public String getPhone() {
		return phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
}
