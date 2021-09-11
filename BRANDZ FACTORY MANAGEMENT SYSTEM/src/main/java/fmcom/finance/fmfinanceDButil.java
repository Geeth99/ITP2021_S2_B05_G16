package fmcom.finance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;



public class fmfinanceDButil {
	
public static boolean incomeinsert(String name,String Bdetails,String discount,
			String Icode,String quantity,String price ) {
		
		boolean isSuccess=false;
		
		//Create database connection
		String url = "jdbc::mysql:://localhost::3306/finance";
		String user ="root";
		String pass ="S20232436!a";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
Connection con = (Connection) DriverManager.getConnection(url,user,pass);
Statement stmt = con.createStatement();

String sql ="insert into income values(0,'"+name+"','"+Bdetails+"','"+discount+"','"+Icode+"','"+quantity+"','"+price+"')";
int rs = stmt.executeUpdate(sql);

if(rs > 0) {
	isSuccess= true;
	}else {
		isSuccess= false;
	}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		
		return isSuccess;
		
		
	}


}

