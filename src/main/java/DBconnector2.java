import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnector2 {
	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public DBconnector2() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tutorial","root","1213");
			st = con.createStatement();
		}
		catch(Exception e) {
			System.out.println("데이터베이스 연결오류 " +  e.getMessage());
		}
	}
	public boolean isAdmin(String adminID, String adminPassword) {
		try {
			String SQL = "SELECT * FROM ADMIN WHERE adminID = '" + adminID + "' AND adminPassword = '" + adminPassword + "'";
			rs = st.executeQuery(SQL);
			
			if(rs.next()) {
				return true;
			}
			
		}
		catch(Exception e) {
			System.out.println("데이터베이스 연결오류 " +  e.getMessage());
		}
		return false;
	}
}
