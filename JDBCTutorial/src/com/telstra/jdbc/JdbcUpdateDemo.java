package com.telstra.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUpdateDemo {
	 public static void main(String[] args) {
		
		/* try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	 
	 String url = "jdbc:mysql://localhost:3306/telstra";
	 String username = "root";
	 String password = "password";
	 String updateCommand ="UPDATE employee SET empid = 8090 WHERE designation = 'Sr Manager' ";
	 int i = 0;
	 Connection cn = null;
	 Statement st = null;
	 
	 try {
		cn = DriverManager.getConnection(url,username,password);
	    st = cn.createStatement();
	    i = st.executeUpdate(updateCommand);
	    System.out.println(i + "updated emp details..");
	 } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 
	 
	 }
	
}
