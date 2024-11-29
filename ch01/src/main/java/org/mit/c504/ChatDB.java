package org.mit.c504;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ChatDB {

	public void insert(String msg) {
		Connection conn=null ;
		PreparedStatement pstmt=null;
		try {  
		  Class.forName("org.mariadb.jdbc.Driver");
		   conn 
		  	=DriverManager.getConnection("jdbc:mariadb://localhost:3307/webdb", 
		  								  "webuser", "webuser");
		  pstmt=conn.prepareStatement(
				  "INSERT INTO historymsg(msg,date) VALUE(?,NOW())");
		  pstmt.setString(1, msg); //첫번째 물음표를 msg로 변경하고
		  pstmt.executeUpdate(); //쿼리 수행
		}catch(Exception e) {
			System.out.println("뭔가 문제 있다.");
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {
				try {	
					pstmt.close();	
				} catch (Exception e) {	
					e.printStackTrace(); 
				} 
			}
			if(conn!=null) {
				try {
					conn.close();	
				}catch (Exception e) {	
					e.printStackTrace(); 
				}
			}
			
		}
	}
	
}
