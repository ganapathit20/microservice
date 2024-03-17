package io.activemq.com;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MessageProducerActivwMq {
	
	public static void main(String[] args) {
		
		 try {
	            // Create a connection factory
	            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");

	            // Create a connection
	            Connection connection = connectionFactory.createConnection();
	            connection.start();

	            // Create a session
	            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

	            // Create a destination (queue)
	            Destination destination = session.createQueue("myTestedQueue");

	            // Create a message producer
	            MessageProducer producer = session.createProducer(destination);

	            // Create and send a message
	            TextMessage message = session.createTextMessage("Hello, ActiveMQ!");
	            producer.send(message);

	            // Clean up resources
	            producer.close();
	            session.close();
	            connection.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
