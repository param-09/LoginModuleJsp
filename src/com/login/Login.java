package com.login;

import java.io.IOException;	
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.LoginDao;
@WebServlet("/Login")
public class Login extends HttpServlet 
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
 		response.getWriter().append("Served at: ").append(request.getContextPath());
 		
 		String user=request.getParameter("user");
 		String pass=request.getParameter("pass");
 		LoginDao dao=new LoginDao();
 		
 		try {
 			 if(user.equals("root")&&pass.equals("root"))
			{

				HttpSession session= request.getSession();
				session.setAttribute("Username",user);
				response.sendRedirect("welcome.jsp");
			
				
			}
 			else if(dao.check(user, pass))
			{
				HttpSession session= request.getSession();
				session.setAttribute("Username",user);
				response.sendRedirect("welcome.jsp");
			}
			
			else
			{
				response.sendRedirect("login.jsp");
			}
		} 
 		catch (ClassNotFoundException e) 
 		{
			e.printStackTrace();
		} catch (SQLException e) 
 		{
			e.printStackTrace();
		} catch (IOException e) 
 		{

			e.printStackTrace();
		}
	}


}
