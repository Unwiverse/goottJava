package collection;
// Coin 클래스와 연관있음

import java.util.*;

/*
 * Stack 클래스(자료구조)
 *  - 후입 선출(LIFO: Last In First Out)구조임.
 *  - 선입 후출(FILO: First In Las Out) 구조임.
 */

public class Stack_07 {

	public static void main(String[] args) {
		//stack 컬렉션 객체 생성
		Stack<Coin> coins =new Stack<>(); //stack 클래스에다가 coin 클래스 타입 지정. 
		
		//1. push(): Stack에 데이터를 넣는 메서드
		coins.push(new Coin(1000));
		coins.push(new Coin(1000));
		coins.push(new Coin(1000));
		coins.push(new Coin(1000));
		coins.push(new Coin(5000));
		
		/*
		 * peek(): stack에 저장된 데이터를 가져오는 메서드.
		 * 				stack의 맨 위(마지막에 저장된)에 있는 데이터를 가져오는 메서드.
		 * 				가져온 후 데이터를 stack에서 제거하지 않는 메서드.
		 */			
		System.out.println(coins.peek().getCoin()); //stack의 맨 위(마지막에 저장된)에 있는 데이터를 가져오는 메서드.
		System.out.println();
		while(!coins.isEmpty()) {// coins 객체가 비어있지 않다면 동작을 계속하라는 while문
			/*
			 * pop():  stack에 저장된 데이터를 가져오는 메서드.
		     * 				stack의 맨 위(마지막에 저장된)에 있는 데이터를 가져오는 메서드.
		     * 				가져온 후 데이터를 stack에서 제거하는 메서드.
			 */
			System.out.println(coins.pop().getCoin());
		}
	}

}
