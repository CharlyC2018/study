package sqlCon;

import java.sql.*;

public class SqlConnection {
	private static final String URL="jdbc:mysql://localhost:3306/charly?&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
	private static final String NAME="root";
	private static final String PASSWORD="123456";
	
	public Connection conn = null;
	
	public void TheSqlConnection() {
		//1.��������
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("δ�ܳɹ������������������Ƿ�����������");
			e.printStackTrace();
		}
		
		
		try {
			conn = DriverManager.getConnection(URL,NAME,PASSWORD);
//			System.out.println("success");
		} catch (SQLException e) {
			System.out.println("fail");
			e.printStackTrace();
		}
	}
	
	public void TheSqlClose() {
		if (conn != null) {
			try {
				conn.close();
				System.out.println("close");
			} catch (SQLException e) {
				e.printStackTrace();
				conn=null;
			}
		}
	}
}