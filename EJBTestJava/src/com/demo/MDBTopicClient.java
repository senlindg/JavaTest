/**
*Missing package-info.java file
*/
package com.demo;

import java.util.Properties;

import javax.jms.TextMessage;
import javax.jms.Topic;
import javax.jms.TopicConnection;
import javax.jms.TopicConnectionFactory;
import javax.jms.TopicPublisher;
import javax.jms.TopicSession;
import javax.naming.InitialContext;

/**
 * @author Administrator
 *
 */
public class MDBTopicClient{
     /**
      * @param args
      * *args for me
     */
    public static void main(final String[] args) {
		try {
			Properties props = new Properties();
			props.setProperty("java.naming.factory.initial",
				     "org.jnp.interfaces.NamingContextFactory");
			props.setProperty("java.naming.provider.url",
					"localhost:1099");
			props.setProperty("java.naming.factory.url.pkgs",
					"org.jboss.naming");
			InitialContext ctx = new InitialContext(props);
			TopicConnectionFactory factory =
					(TopicConnectionFactory)
					ctx.lookup("ConnectionFactory");
			TopicConnection connection =
					factory.createTopicConnection();
			TopicSession session = connection.createTopicSession(
					false,
					TopicSession.AUTO_ACKNOWLEDGE);
			Topic topic = (Topic) ctx.lookup("/topic/mytopic");
			TextMessage msg =
					session.createTextMessage("你好，"
							+ "这是一个主题消息！");
			TopicPublisher publisher =
					session.createPublisher(topic);
			publisher.send(msg);
			session.close();
			connection.close();
			System.out.println("消息已经发送！");
		 } catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
