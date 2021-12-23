package com.github.pedroluiznogueira.microservices.messagingconsumer.configuration;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfig {

    // simplest way of creating exchange
    @Bean
    Exchange myFirstExchange() {
        return new TopicExchange("myFirstExchange");
    }

    // direct exchange
    @Bean
    Exchange directExchange() {
        return ExchangeBuilder
                .directExchange("DirectExchange")
                .autoDelete()
                .internal()
                .build();
    }

    // topic exchange
    @Bean
    Exchange topicExchange() {
        return ExchangeBuilder
                .topicExchange("TopicExchange")
                .durable(true)
                .internal()
                .build();
    }

    // fanout exchange
    @Bean
    Exchange fanoutExchange() {
        return ExchangeBuilder
                .fanoutExchange("FanoutExchange")
                .autoDelete()
                .durable(false)
                .internal()
                .build();
    }

    // headers exchange
    @Bean
    Exchange headersExchange() {
        return ExchangeBuilder
                .headersExchange("HeadersExchange")
                .internal()
                .durable(false)
                .ignoreDeclarationExceptions()
                .build();
    }
}
