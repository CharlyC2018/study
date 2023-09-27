package sqlCon;

import java.sql.*;

public class MainClass {

	public static void main(String[] args) {
		SqlConnection sqlCon = new SqlConnection();
		sqlCon.TheSqlConnection();
		
		Statement stmt;
		try {
			stmt = sqlCon.conn.createStatement();
			String sql = "select e.id,e.name,e.job,d.name from emp e left join dept d on e.dept_id = d.id";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("id"+"\t"+"name"+"\t"+"job"+"\t"+"department");
			while (rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.println(rs.getString(4)+"\t");
				System.out.println();
			}
			rs.close();
			stmt.close();
			sqlCon.TheSqlClose();	
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}