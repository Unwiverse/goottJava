package goott;

import java.sql.*;


public class select {

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
			//1단계: 오라클 드라이버를 동적으로 메모리로 로딩 ==> 프로그램 실행 시 드라이버 로딩.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			System.out.println("오라클 드라이버 로딩 완료");
			//2단계: 자바와 오라클 DB 연결 시도(진행).
			con = DriverManager.getConnection(url, user, password);
			
			if(con != null) {
				System.out.println("오라클 DB와 연결");
			}
			// 3단계: DB에 전송할 SQL 문을 작성
			String sql = "select * from member order by memno desc";
			pstmt = con.prepareStatement(sql);
			
			//4단계: 데이터베이스에 sql문을 전송 및 실행.
			rs = pstmt.executeQuery();
			
			//5단계: 결과 데이터를 반복해 가져와서 출력
			while(rs.next()) {
				int num = rs.getInt("memno");
				String id = rs.getString("memid");
				String name = rs.getString("memname");
				String pwd = rs.getString("mempwd");
				int age = rs.getInt("age");
				int mileage = rs.getInt("mileage");
				String job = rs.getString("job");
				String addr = rs.getString("addr");
				String regdate = rs.getString("regdate").substring(0, 10);
				System.out.println(num+ "\t" + id + "\t" + name + "\t" + pwd + "\t" + age + "\t" + mileage + "\t" + job + "\t" + addr + "\t" + regdate );
				System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			} // while문 end
			
			//6단계: 연결돼있던 자원 종료.
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
