package goott;

import javax.swing.JOptionPane;

public class Operator_02 {

	public static void main(String[] args) {
		
		int num1 =
		Integer.parseInt(JOptionPane.showInputDialog("1번째 숫자 입력"));
		
		int num2 =
		Integer.parseInt(JOptionPane.showInputDialog("2번째 숫자 입력"));
		
		System.out.println("덧셈>>>"+(num1+num2));
		
		System.out.println("뺄셈>>>"+(num1-num2));
		System.out.println("곱셈>>>"+(num1*num2));
		// 나눗셈
		System.out.println("나눗셈>>>"+(num1/num2)); // 몫이 나옴
		// 나머지 연산
		System.out.println("나눈 나머지>>>"+(num1%num2));
		
	}

}
