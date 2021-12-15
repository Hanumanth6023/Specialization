package com.example.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddSer {
	
	@WebServlet("/Addser")
	public class Addser extends HttpServlet {
		private static final long serialVersionUID = 1L;
	       
	    
	    public Addser() {
	        super();
	        
	    }
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			int a = Integer.parseInt(request.getParameter("txtnum1"));
			int b = Integer.parseInt(request.getParameter("txtnum2"));
			int c=0;
			if(request.getParameter("btnsubmit").equals("+"))
			{
			c= a+b;
			}
			
			response.sendRedirect("cal.jsp?q="+c);
			
		}

	}
	

}
