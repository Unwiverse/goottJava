package accessTwo;

import accessOne.Super; //다른 패키지에 있는 클래스를 상속받을 때 자동 생성

public class Sub extends Super{

	public static void main(String[] args) {
		Sub sub = new Sub();
		//System.out.println("num1: "+sub.num1); //private 접근제어자는 해당 클래스에서만 접근 가능
		System.out.println("num2: "+sub.num2); //protected 접근제어자는 다른 패키지 클래스에서도 접근 가능(상속관계라면)
		//System.out.println("num3: "+sub.num3); //default 접근제어자는 다른 패키지에서는 접근 불가
		System.out.println("num4: "+sub.num4); //public 접근제어자는 모든 패키지에서 접근 가능
	}

}
