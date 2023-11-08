package com.jsp.ResponseRedirectoryPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sendResp2")
public class Response2 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("data from 2nd servlet class");
		System.out.println("------------------------------------");
		String id=req.getParameter("id");
		String name=req.getParameter("name");
		String email=req.getParameter("email");
//		System.out.println(id);
//		System.out.println(name);
//		System.out.println(email);
		String s=req.getParameter("k");
		PrintWriter writer=resp.getWriter();
		resp.getWriter().println("response from 2nd ");
		writer.println(s);
		
		
	}
}
