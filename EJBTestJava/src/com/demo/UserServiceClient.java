package com.demo;

import java.util.Properties;

import javax.naming.InitialContext;

import com.demo.ejb.service.UserService;

/**
 * @author Administrator
 *
 */
public class UserServiceClient
{ 

	/**
	 * @param args
	 */
	public static void main(String[] args){ 
		// TODO Auto-generated method stub
		Properties props = new Properties();
		props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		props.setProperty("java.naming.provider.url", "localhost:1099");
		props.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming");
		try
		{
			InitialContext ctx = new InitialContext(props);
			UserService userService = (UserService)ctx.lookup("UserServiceImpl/remote");
			boolean b= userService.login("admin", "admin");
			System.out.println(b);
		}catch (Exception e){ 
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
