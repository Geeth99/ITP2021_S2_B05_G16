package fmcom.finance;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FmincomeDservlet")
public class FmincomeDservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String search =request.getParameter("searchid");
		
		try{
		List<fmincome> incDetails=fmfinanceDButil.validate(search);
		request.setAttribute("incDetails", incDetails);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		RequestDispatcher dis = request.getRequestDispatcher("fmtransactions.jsp");
		dis.forward(request,  response);
		
	}

}
