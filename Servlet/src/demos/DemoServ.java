package demos;

import java.io.IOException;

import javax.servlet.*;
/*import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;*/
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServ
 */
@WebServlet("/welcome.do")
public class DemoServ extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res)  
			throws ServletException,IOException  
			{  
			res.setContentType("text/html");  
			String name=req.getParameter("name");//will return value  
			
			RequestDispatcher rd=req.getRequestDispatcher("Page1");
			rd.forward(req, res);
			 
			}}  
