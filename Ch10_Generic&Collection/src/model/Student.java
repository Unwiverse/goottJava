package model;

public class Student {
	String hakbun;
	String studNo;
	String major;
	String phone;
	
	public Student() {}
	public Student(String hakbun, String studNo, String major, String phone) {
		this.hakbun = hakbun;
		this.studNo = studNo;
		this.major = major;
		this.phone = phone;
	}
	
	public String getHakbun() {
		return hakbun;
	}
	public String getStudNo() {
		return studNo;
	}
	public String getMajor() {
		return major;
	}
	public String getPhone() {
		return phone;
	}
	public void setHakbun(String hakbun) { //인자 생성자를 쓰기 때문에 setter메서드는 굳이 필요없
		this.hakbun = hakbun;
	}
	public void setStudNo(String studNo) {
		this.studNo = studNo;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
