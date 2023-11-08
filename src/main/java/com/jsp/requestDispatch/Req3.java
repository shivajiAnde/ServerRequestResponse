package com.jsp.requestDispatch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/req3")
public class Req3 extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer=resp.getWriter();
		writer.println("servlet 3");
		writer.println("<h1>"+req.getParameter("email")+"</h1>");
		writer.println("<h1>"+req.getParameter("age")+"</h1>");
	}
}
