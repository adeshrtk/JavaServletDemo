package com.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq")
public class SqServlet extends HttpServlet {

//	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//		
//		int k = (int)req.getAttribute("k");
//		
//		k = k * k;
//		
//		PrintWriter out = res.getWriter();
//		out.println("Square of No is = " + k);
//	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
			
			//int k = Integer.parseInt(req.getParameter("k"));
//			HttpSession session = req.getSession();
//			int k = (int)session.getAttribute("k");
		
			int k = 0;
			Cookie cookies[] = req.getCookies();
			for(Cookie c : cookies) {
				if(c.getName().equals("k"))
					k = Integer.parseInt(c.getValue());
			}
			
			k = k * k;
			
			PrintWriter out = res.getWriter();
			out.println("Result is : " + k);
			
//			out.println("Hi ");
//			
//			ServletContext ctx = getServletContext();
//			String name = ctx.getInitParameter("name");
//			out.println(name);
//			
//			String phone = ctx.getInitParameter("phone");
//			out.println(phone);			
//			
//			ServletConfig cg = getServletConfig();
//			String str = cg.getInitParameter("servletname");
//			out.println(str);
		
			System.out.println("Sq called");
	}	
	
}
