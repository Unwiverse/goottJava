package goott;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class select1 {

	public static void main(String[] args) {
		// 오라클 DB와 연결하는 객체
				Connection con = null;
				// sql문을 데이터베이스에 전송하는 객체
				PreparedStatement pstmt = null;
				//sql문을 실행한 뒤 결과값을 갖고있는 객체
				ResultSet rs = null;
				
				
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "goott";
				String password = "992992";
				
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					con = DriverManager.getConnection(url, user, password);
					
					String sql = "select * from products";
					pstmt = con.prepareStatement(sql);
					
					rs = pstmt.executeQuery();
					
					while(rs.next()) {
						int num = rs.getInt("pnum");
						String ctgr = rs.getString("category_fk");
						String prod = rs.getString("products_name");
						String code= rs.getString("ep_code_fk");
						int ip = rs.getInt("input_price");
						int op = rs.getInt("output_price");
						int tc = rs.getInt("trans_cost");
						int m = rs.getInt("mileage");
						String c = rs.getString("company");
						
						System.out.println(num+"\t"+ctgr+"\t"+prod+"\t"+code+"\t"+ip+"\t"+op+"\t"+tc+"\t"+m+"\t"+c);
						System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::");
						
						
					}
					rs.close();
					pstmt.close();
					con.close();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

	}

}
