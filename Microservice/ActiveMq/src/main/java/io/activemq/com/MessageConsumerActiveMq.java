package io.activemq.com;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MessageConsumerActiveMq {

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

	            // Create a message consumer
	            MessageConsumer consumer = session.createConsumer(destination);

	            // Receive and process messages
	            while (true) {
	                Message message = consumer.receive();
	                if (message instanceof TextMessage) {
	                    TextMessage textMessage = (TextMessage) message;
	                    System.out.println("Received message: " + textMessage.getText());
	                }
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	}

}
