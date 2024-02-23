package Exam;

import javax.swing.JOptionPane;

public class ProductSearch {

	public static void main(String[] args) {
		String productName = JOptionPane.showInputDialog("검색할 상품명");
		
		ProductSearchData psd = new ProductSearchData();	
		String productInfo = psd.search(productName);
		
		try {
			productInfo.length();
			JOptionPane.showMessageDialog(null, productInfo);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "해당 상품이 없다");
			e.printStackTrace();
		} finally {
			System.out.println();
			System.out.println("예외 내용 확인");
		}
	}

}
