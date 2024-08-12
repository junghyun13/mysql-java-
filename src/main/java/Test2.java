import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {

	public static void main(String[] args) {
		DBconnector2 connection = new DBconnector2();
		System.out.println("관리자 여부: " + connection.isAdmin("admin", "admin"));
		
		
		
	}

}
