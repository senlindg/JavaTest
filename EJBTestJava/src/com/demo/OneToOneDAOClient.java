/**
 * 
 */
package com.demo;

import java.util.Properties;

import javax.naming.InitialContext;

import com.ejb.one2one.OneToOneDAORemote;
import com.ejb.one2one.province;

/**
 * @author Administrator
 *
 */
public class OneToOneDAOClient
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
			OneToOneDAORemote oneToOneDAO = (OneToOneDAORemote)ctx.lookup("OneToOneDAO/remote");
			
			oneToOneDAO.insert("my", "Andy", "234", "Candy");
			
			province province = oneToOneDAO.select(new Integer(3));
			if (province!=null)
			{
				System.out.println("省名:" + province.getProvincename());
				System.out.println("省长："+province.getProvinceman());
				System.out.println("省会:" + province.getCity().getCityname());
				System.out.println("市长:"  + province.getCity().getCityman());
			}
			
			
			oneToOneDAO.update(new Integer(1), "河北省", "Jack", "石家庄市", "Mike");
			
			province province2 = oneToOneDAO.select(new Integer(3));
			
			if (province2!=null)
			{
				System.out.println("更新后省名:" + province2.getProvincename());
				System.out.println("更新后省长：" +province2.getProvinceman());
				System.out.println("更新后省会：" + province2.getCity().getCityname());
				System.out.println("更新后市长：" + province2.getCity().getCityman());
				
			}
//			oneToOneDAO.delete(new Integer(1));
		} catch (Exception e)
		{
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
