package Exam;

import javax.swing.*;

public class ProductSearch { //생성 클래스

	public static void main(String[] args) {
		
		ProductSearchData data = new ProductSearchData();
		
		JFrame j = new JFrame();
		try {
			String str = JOptionPane.showInputDialog(j, "검색할 상품"); 
			String out = data.search(str); //str = 실인수
			out.length();
			JOptionPane.showMessageDialog(j, out);
		} catch(Exception e) { //예외가 발생할 경우 처리할 부분
			JOptionPane.showMessageDialog(j, "ㅋ");
			
			
			
		}
	}

}
