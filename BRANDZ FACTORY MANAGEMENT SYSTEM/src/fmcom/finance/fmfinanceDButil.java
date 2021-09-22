package fmcom.finance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class fmfinanceDButil {
	
	private static boolean isSuccess =false;
	private static Connection con=null;
	private  static Statement stmt =null;
	private static ResultSet rs=null;
	
	
public static boolean incomeinsert(String name,String Bdetails,String discount,
			String Icode,String quantity,String price ) {
		
		
		
		//Create database connection
		String url = "jdbc:mysql://localhost:3306/finance";
		String user ="root";
		String pass ="S20232436!a";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
Connection con = (Connection) DriverManager.getConnection(url,user,pass);
Statement stmt = con.createStatement();

String sql ="insert into income values (0,'"+name+"','"+Bdetails+"','"+discount+"','"+Icode+"','"+quantity+"','"+price+"')";
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



	public static List<fmincome> validate(String Search){
		
		ArrayList<fmincome> inc= new ArrayList<>();
		
				try {
					
					
					con =fmDBconnect.getConnection();
					stmt =con.createStatement();
					
					
					String sql ="select * from income where bname='"+Search+"'";
					 rs =stmt.executeQuery(sql);
					 
					 
					 if(rs.next()) {
						 int transactionid =rs.getInt(1);
						 String bname= rs.getString(2);
						 String bankDetails =rs.getString(3);
						 String discount =rs.getString(4);
						 String icode =rs.getString(5);
						 String quantity =rs.getString(6);
						 String proce =rs.getString(7);

	fmincome i =new fmincome(transactionid,bname,
								 bankDetails,discount,icode,quantity,proce);
	
	inc.add(i);
					 }
						 
					
				}catch(Exception e) {
					e.printStackTrace();
				}
		
		
		
		return inc;
		
		
	}
	
	public static boolean updatedetails(String id,String Bname,String BankDetails,String Disount,String icode,
			String quan,String Price) {
		
	try{
		con =fmDBconnect.getConnection();
		stmt =con.createStatement();
		
		String sql="update income set bname='"+Bname+"',bankDetails='"+BankDetails+"',discount='"+Disount+"',icode='"+icode+"',"
				+ "quantity='"+quan+"',proce='"+Price+"'"+ "Where transactionid ='"+id+"'";
		int rs= stmt.executeUpdate(sql);
		
		
		if(rs > 0) {
			isSuccess =true;
			
		}else {
			isSuccess =false;
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		
		
		
				return isSuccess;
		
	}


}

