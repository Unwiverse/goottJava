package goott;

import javax.swing.JOptionPane; //Run configurations....

public class Operator_03 {

	public static void main(String[] args) {
		
		int num1 = Integer.parseInt(args[0]);
				
		int num2 = Integer.parseInt(args[1]);
				
		System.out.println("덧셈>>>"+(num1+num2));
		System.out.println("뺄셈>>>"+(num1-num2));
		// 곱셈
		System.out.println("곱셈>>>"+(num1*num2));
		// 나눗셈
		System.out.println("나눗셈>>>"+(num1/num2)); // 몫이 나옴
		// 나머지 연산
		System.out.println("나눈 나머지>>>"+(num1%num2));

	}

}
