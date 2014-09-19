/**
 * 
 */
package com.demo;

import java.io.Serializable;
import java.util.Properties;

import javax.naming.InitialContext;

import org.jboss.security.client.SecurityClient;
import org.jboss.security.client.SecurityClientFactory;

import com.ejb.jaas.JAASBeanRemote;

/**
 * @author Administrator
 *
 */
public class JAASBeanClient implements Serializable
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
			JAASBeanRemote jaasBean = (JAASBeanRemote)ctx.lookup("JAASBean/remote");
			
			
			String username="root";
			String password ="123";
			SecurityClient client = SecurityClientFactory.getSecurityClient();
			client.setSimple(username, password);
			client.login();
			try
			{
				System.out.println("访问成功:" + jaasBean.init());
			} catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("无权访问：init()");
			}
			try
			{
				System.out.println("访问成功：" +jaasBean.insertOrUpdateOrDelete());
			} catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("无权访问：insertOrUpdateOrDelete()");
			}
			try
			{
				System.out.println("访问成功:" + jaasBean.view());
			} catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("无权访问：view()");
			}
			try
			{
				System.out.println("访问成功：" +jaasBean.open());
			} catch (Exception e)
			{
				// TODO: handle exception
				System.out.println("无权访问：open()");
			}
			client.logout();
		} catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
