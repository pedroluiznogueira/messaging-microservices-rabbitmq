package com.github.pedroluiznogueira.microservices.messaging;

import com.github.pedroluiznogueira.microservices.messaging.model.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.SerializationUtils;

@SpringBootApplication
public class MessagingApplication implements CommandLineRunner {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public static void main(String[] args) {
		SpringApplication.run(MessagingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Message message = new Message();
		message.setName("Message name");
		message.setDescription("Message description");

		rabbitTemplate.convertAndSend("MyTopicExchange", "topic", message);
	}
}
