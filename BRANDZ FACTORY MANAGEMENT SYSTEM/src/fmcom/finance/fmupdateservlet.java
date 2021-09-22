package fmcom.finance;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/fmupdateservlet")
public class fmupdateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id =request.getParameter("transid");
		String Bname =request.getParameter("Bname");
		String BankDetails =request.getParameter("Bank-details");
		String Disount =request.getParameter("Disount");
		String icode =request.getParameter("icode");
		String quan =request.getParameter("quan");
		String Price=request.getParameter("Price");
		
		
		boolean istrue;
		istrue = fmfinanceDButil.updatedetails(id, Bname, BankDetails, Disount, icode, quan, Price);
		if(istrue==true) {
			RequestDispatcher dis= request.getRequestDispatcher("fmsuccess.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis= request.getRequestDispatcher("fmunsuccess.jsp");
			dis.forward(request, response);
		}
		
	}

}
