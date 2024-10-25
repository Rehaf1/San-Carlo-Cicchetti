package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement; 

public class SanCarloCicchetti {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		


		     String URL = "jdbc:mysql://localhost:3306/San Carlo Cicchetti";
		     String USER = "root";
		     String PASSWORD = "Rehaf123";

		     Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
		      
		      String selecttry = "SELECT * FROM CUSTOMER";
		      Statement ps = con.createStatement();
		  //    ps.setString(1, "value");
		      ResultSet rs = ps.executeQuery(selecttry);
		      ResultSetMetaData rsmd = rs.getMetaData();
		    while(rs.next()) {
		    	  System.out.println(rs.getString(1)+ "  ,  " + rs.getString(2) );
		      }
		
		    	  
		    
		}}

	
		


