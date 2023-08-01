package com.mavenproject.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/hello")
public class HelloServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException  
	{
		resp.setContentType("text/plain");
		resp.getWriter().write("Maven Web project tomcat server\n");
		String email = req.getParameter("email");
        String psw = req.getParameter("psw");
        String pswr = req.getParameter("psw-repeat");

        resp.getWriter().write("\nEmail:"+email);
        resp.getWriter().write("\n\nPassword: "+psw);
    }
		
	}
	
	
