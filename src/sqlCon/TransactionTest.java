package sqlCon;

import java.sql.*;

public class TransactionTest {
	public static void main(String[] args) {
		SqlConnection sqlCon = new SqlConnection();
		sqlCon.TheSqlConnection();
		
		Statement stmt;
		
		try {
			stmt = sqlCon.conn.createStatement();
			String sql = "Select name,money from account where name = '李四'";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("name"+"\t"+"money");
			boolean x = false;
			while (rs.next()) {
				
				System.out.print(rs.getString(1)+"\t");
				if (rs.getInt(2) >= 1000) {
					x = true;
					System.out.println(rs.getInt(2));	
				}
			}	
			if (x) {
				stmt.execute("start transaction");
				stmt.executeUpdate("update account set money = money - 1000 where name = '李四'");
				stmt.executeUpdate("update account set money = money + 1000 where name = '张三'");
				stmt.execute("commit");
				System.out.println("commit");
			}else {
				stmt.execute("rollback");
				System.out.println("rollback");
			}
			
			rs.close();
			stmt.close();
			sqlCon.TheSqlClose();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}