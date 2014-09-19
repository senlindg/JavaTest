package com.demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.javabean.UserBean;

public class RegisterServlet extends HttpServlet {

	public final static long serialVersionUID = 0;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 取得参数
		String username = request.getParameter("username");
		String password1 = request.getParameter("password1");
		String email = request.getParameter("email");

		// 注册用户
		UserBean userBean = new UserBean();
		boolean isExist = userBean.isExist(username);
		if(!isExist) {
			userBean.add(username, password1, email);
			response.sendRedirect("login.jsp");
		} else {
			response.sendRedirect("register.jsp");
		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

}
