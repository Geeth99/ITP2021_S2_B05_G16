package fmcom.finance;

import java.sql.Connection;
import java.sql.DriverManager;

public class fmDBconnect {
	//create database connection
		private static String url = "jdbc:mysql://localhost:3306/finance";
		private static String user ="root";
		private static String pass ="S20232436!a";
		private static Connection con;
		
		public static Connection getConnection() {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				 con =  DriverManager.getConnection(url,user,pass);
				
			}catch(Exception e){
				System.out.println("Database connection is not successful");
			}
			
			return con;
			
			
		}
 
		
}


