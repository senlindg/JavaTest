package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.javabean.UserBean;

public class AjaxServlet extends HttpServlet {

	public final static long serialVersionUID = 0;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		response.setContentType("text/xml");
		response.setHeader("Cache-Control","no-cache");
		String username = request.getParameter("username");

		UserBean userBean = new UserBean();
		boolean isExist = userBean.isExist(username);
		
		PrintWriter out = response.getWriter();
		if(isExist) {
			out.print("<content>failure</content>");
		}else{
			out.print("<content>ok</content>");
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
