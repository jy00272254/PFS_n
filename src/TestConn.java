import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestConn {

	public static void main(String[] args) {
		
		String driver = "com.ibm.db2.jcc.DB2Driver";
		String url = "jdbc:db2:BONCBI";
		String user = "dm";
		String password = "scltuser";
		String sql = "select * from REPORT.REPORT_M_3G_USER_COMMISION_FEE";
		
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet rs = null;
		
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url, user, password);
			
			prep = conn.prepareStatement(sql);
			rs = prep.executeQuery();
			int i = 0;
			while(rs.next()){
				i ++ ;
				if((i +1) % 100000 == 0)
					System.out.println(i);
//				System.out.print(rs.getString(1)+"		");
//				System.out.print(rs.getString(2)+"		");
//				System.out.print(rs.getString(3)+"		");
//				System.out.print(rs.getString(4)+"		");
//				System.out.println(rs.getString(5));
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} finally{
				try {
					if(rs != null)
						rs.close();
					if(prep != null)
						prep.close();
					if(conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

}
