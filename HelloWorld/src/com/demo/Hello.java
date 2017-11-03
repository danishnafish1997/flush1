package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
		PrintWriter out = res.getWriter();
		out.println("Hello world");
	}
}
