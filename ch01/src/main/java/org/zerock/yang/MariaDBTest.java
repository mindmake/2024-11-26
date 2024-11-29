package org.zerock.yang;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MariaDBTest {

	public static void main(String[] args) throws Exception {
		  Class.forName("org.mariadb.jdbc.Driver");
		  Connection conn 
		  	=DriverManager.getConnection("jdbc:mariadb://localhost:3307/webdb", 
		  								  "webuser", "webuser");
		  PreparedStatement pstmt=conn.prepareStatement("SELECT * FROM webdb.tbl_todo");
		  ResultSet result=pstmt.executeQuery();
		  while(result.next()) {
			  System.out.println(result.getLong(1)+" "     //tno
			                    + result.getString(2) +" " //title
			                    + result.getString(3) +" " //due_date
			                    + result.getString(4)) ; //finished
		  }
		  

	}

}
