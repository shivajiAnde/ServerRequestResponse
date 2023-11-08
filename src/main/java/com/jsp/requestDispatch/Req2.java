package com.jsp.requestDispatch;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/req2")
public class Req2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<h1>"+req.getParameter("id")+"</h1>");
		out.println("<h2>"+req.getParameter("name")+"</h2>");
		RequestDispatcher rD=req.getRequestDispatcher("req3");
		rD.forward(req, resp);
	}
}
