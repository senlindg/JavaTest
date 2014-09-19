/**
 * 
 */
package com.demo;

import java.util.Properties;

import javax.naming.InitialContext;

import com.demo.ejb.beans.address;
import com.demo.ejb.service.AddressService;
import com.demo.ejb.service.UserService;

/**
 * @author Administrator
 *
 */
public class AddressClient
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Properties props = new Properties();
		props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		props.setProperty("java.naming.provider.url", "localhost:1099");
		props.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming");
		try
		{
			InitialContext ctx = new InitialContext(props);
			AddressService addressService = (AddressService)ctx.lookup("AddressServiceImpl/remote");
			address address = addressService.select(1);
			System.out.println("username:" + address.getUsername());
			System.out.println("name" + address.getName());
			System.out.println("sex:" + address.getSex());
			System.out.println("qq:" + address.getQq());
		} catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
