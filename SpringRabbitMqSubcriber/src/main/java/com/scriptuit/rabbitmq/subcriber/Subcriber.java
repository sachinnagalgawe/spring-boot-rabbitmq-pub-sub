package com.scriptuit.rabbitmq.subcriber;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Subcriber {

	@RabbitListener(queues="${scriptuit.rabbitmq.queue}")
    public void recievedMessage(Object msg) {
        System.out.println("Recieved Message: " + msg);
    }
	
	@RabbitListener(queues="${scriptuit.rabbitmq.msgQueue}")
    public void recievedMessage(String msg) {
        System.out.println("Recieved Message: " + msg);
    }
}