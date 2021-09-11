package fmcom.finance;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/fmincomeinsert")
public class fmincomeinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	String name = request.getParameter("Bname");
	String Bdetails = request.getParameter("Bank-details");
	String discount = request.getParameter("Disount");
	String Icode = request.getParameter("icode");
	String quantity = request.getParameter("quan");
	String price = request.getParameter("Price");
	
	boolean isTrue;
	
	isTrue=fmfinanceDButil.incomeinsert(name, Bdetails, discount, Icode, quantity, price);
	if(isTrue == true) {
		RequestDispatcher dis= request.getRequestDispatcher("fmsuccess.jsp");
		dis.forward(request, response);
		
	}else {
		RequestDispatcher dis2= request.getRequestDispatcher("fmunsuccess.jsp");
		dis2.forward(request, response);
	}
	

	}
}
