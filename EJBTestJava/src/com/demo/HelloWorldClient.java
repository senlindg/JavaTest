/**
 * 
 */
package com.demo;

import java.util.Properties;

import javax.naming.InitialContext;

import com.ejb.HelloWorldRemote;
import com.ejb.ext.lifecycle.LifeCycleBeanRemoteRemote;

/**
 * @author Administrator
 *
 */
public class HelloWorldClient
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Properties props= new Properties();
		props.setProperty("java.naming.factory.initial","org.jnp.interfaces.NamingContextFactory" );
		props.setProperty("java.naming.provider.url", "localhost:1099");
		props.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming");
		try
		{
			InitialContext ctx = new InitialContext(props);
			LifeCycleBeanRemoteRemote helloworld = (LifeCycleBeanRemoteRemote)ctx.lookup("LifeCycleBeanRemote/remote");
			System.out.println(helloworld.sayHello("World"));
		
		} catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
