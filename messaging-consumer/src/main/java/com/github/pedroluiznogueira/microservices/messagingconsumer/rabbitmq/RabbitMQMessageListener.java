package com.github.pedroluiznogueira.microservices.messagingconsumer.rabbitmq;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;

public class RabbitMQMessageListener implements MessageListener {

    @Override
    public void onMessage(Message message) {
        System.out.println("message = [" + new String(message.getBody().toString()) + "]");
    }
}
